import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnomalyDetector {
    private static final double HIGH_AMOUNT_LIMIT = 50000.00;
    private static final double AVERAGE_MULTIPLIER = 2.5;

    private final InvoiceValidator validator;

    public AnomalyDetector() {
        validator = new InvoiceValidator();
    }

    public List<Anomaly> detectAnomalies(InvoiceRepository repository) {
        List<Anomaly> anomalies = new ArrayList<>();
        Set<String> reportedDuplicateKeys = new HashSet<>();

        double averageAmount = repository.calculateAverageTotal();

        for (Invoice invoice : repository.getAllInvoices()) {
            anomalies.addAll(validator.validate(invoice));

            if (repository.containsDuplicate(invoice)
                    && reportedDuplicateKeys.add(invoice.getDuplicateKey())) {

                anomalies.add(new Anomaly(
                        safeInvoiceNumber(invoice),
                        AnomalyType.DUPLICATE_INVOICE,
                        "CRITICAL",
                        "A possible duplicate invoice was detected."
                ));
            }

            boolean exceedsFixedLimit =
                    invoice.getTotalAmount() > HIGH_AMOUNT_LIMIT;

            boolean exceedsAverage =
                    averageAmount > 0
                    && invoice.getTotalAmount()
                    > averageAmount * AVERAGE_MULTIPLIER;

            if (exceedsFixedLimit || exceedsAverage) {
                anomalies.add(new Anomaly(
                        safeInvoiceNumber(invoice),
                        AnomalyType.UNUSUALLY_HIGH_AMOUNT,
                        "HIGH",
                        String.format(
                                "Invoice total %.2f is unusually high.",
                                invoice.getTotalAmount()
                        )
                ));
            }
        }

        return anomalies;
    }

    private String safeInvoiceNumber(Invoice invoice) {
        if (invoice.getInvoiceNumber() == null
                || invoice.getInvoiceNumber().trim().isEmpty()) {
            return "UNKNOWN";
        }

        return invoice.getInvoiceNumber();
    }
}
