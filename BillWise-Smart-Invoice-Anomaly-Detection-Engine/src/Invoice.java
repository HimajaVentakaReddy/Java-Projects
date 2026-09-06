import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Invoice {
    private final String invoiceNumber;
    private final String vendorName;
    private final LocalDate invoiceDate;
    private final double subtotal;
    private final double taxAmount;
    private final double totalAmount;

    public Invoice(
            String invoiceNumber,
            String vendorName,
            LocalDate invoiceDate,
            double subtotal,
            double taxAmount,
            double totalAmount) {

        this.invoiceNumber = invoiceNumber;
        this.vendorName = vendorName;
        this.invoiceDate = invoiceDate;
        this.subtotal = subtotal;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getVendorName() {
        return vendorName;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getDuplicateKey() {
        String normalizedNumber = invoiceNumber == null
                ? ""
                : invoiceNumber.trim().toLowerCase();

        String normalizedVendor = vendorName == null
                ? ""
                : vendorName.trim().toLowerCase();

        return normalizedNumber + "|" + normalizedVendor + "|" + totalAmount;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return String.format(
                "%-12s | %-20s | %-10s | %10.2f | %9.2f | %11.2f",
                invoiceNumber,
                vendorName,
                invoiceDate.format(formatter),
                subtotal,
                taxAmount,
                totalAmount
        );
    }
}
