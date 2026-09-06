public class Anomaly {
    private final String invoiceNumber;
    private final AnomalyType type;
    private final String severity;
    private final String description;

    public Anomaly(
            String invoiceNumber,
            AnomalyType type,
            String severity,
            String description) {

        this.invoiceNumber = invoiceNumber;
        this.type = type;
        this.severity = severity;
        this.description = description;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public AnomalyType getType() {
        return type;
    }

    public String getSeverity() {
        return severity;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format(
                "[%s] Invoice: %-12s | Type: %-22s | %s",
                severity,
                invoiceNumber,
                type,
                description
        );
    }
}
