import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InvoiceValidator {
    private static final double EXPECTED_TAX_RATE = 0.18;
    private static final double TAX_TOLERANCE = 1.00;

    public List<Anomaly> validate(Invoice invoice) {
        List<Anomaly> anomalies = new ArrayList<>();

        if (invoice.getInvoiceNumber() == null
                || invoice.getInvoiceNumber().trim().isEmpty()) {

            anomalies.add(new Anomaly(
                    "UNKNOWN",
                    AnomalyType.INVALID_INVOICE_NUMBER,
                    "HIGH",
                    "Invoice number is missing."
            ));
        }

        if (invoice.getVendorName() == null
                || invoice.getVendorName().trim().isEmpty()) {

            anomalies.add(new Anomaly(
                    safeInvoiceNumber(invoice),
                    AnomalyType.MISSING_VENDOR,
                    "HIGH",
                    "Vendor name is missing."
            ));
        }

        if (invoice.getSubtotal() <= 0
                || invoice.getTaxAmount() < 0
                || invoice.getTotalAmount() <= 0) {

            anomalies.add(new Anomaly(
                    safeInvoiceNumber(invoice),
                    AnomalyType.INVALID_AMOUNT,
                    "CRITICAL",
                    "Invoice contains zero, negative or otherwise invalid amounts."
            ));
        }

        if (invoice.getInvoiceDate() != null
                && invoice.getInvoiceDate().isAfter(LocalDate.now())) {

            anomalies.add(new Anomaly(
                    safeInvoiceNumber(invoice),
                    AnomalyType.FUTURE_DATE,
                    "MEDIUM",
                    "Invoice date is in the future."
            ));
        }

        double expectedTax = invoice.getSubtotal() * EXPECTED_TAX_RATE;
        double expectedTotal = invoice.getSubtotal() + invoice.getTaxAmount();

        if (invoice.getSubtotal() > 0
                && Math.abs(expectedTax - invoice.getTaxAmount()) > TAX_TOLERANCE) {

            anomalies.add(new Anomaly(
                    safeInvoiceNumber(invoice),
                    AnomalyType.TAX_MISMATCH,
                    "MEDIUM",
                    String.format(
                            "Expected tax is approximately %.2f, but recorded tax is %.2f.",
                            expectedTax,
                            invoice.getTaxAmount()
                    )
            ));
        }

        if (Math.abs(expectedTotal - invoice.getTotalAmount()) > TAX_TOLERANCE) {
            anomalies.add(new Anomaly(
                    safeInvoiceNumber(invoice),
                    AnomalyType.INVALID_AMOUNT,
                    "HIGH",
                    String.format(
                            "Subtotal plus tax is %.2f, but total amount is %.2f.",
                            expectedTotal,
                            invoice.getTotalAmount()
                    )
            ));
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
