import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InvoiceRepository {
    private final List<Invoice> invoices;

    public InvoiceRepository() {
        invoices = new ArrayList<>();
    }

    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public List<Invoice> getAllInvoices() {
        return Collections.unmodifiableList(invoices);
    }

    public int size() {
        return invoices.size();
    }

    public boolean isEmpty() {
        return invoices.isEmpty();
    }

    public boolean containsDuplicate(Invoice targetInvoice) {
        int matchingInvoices = 0;

        for (Invoice invoice : invoices) {
            if (invoice.getDuplicateKey().equals(targetInvoice.getDuplicateKey())) {
                matchingInvoices++;
            }
        }

        return matchingInvoices > 1;
    }

    public double calculateAverageTotal() {
        if (invoices.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Invoice invoice : invoices) {
            total += invoice.getTotalAmount();
        }

        return total / invoices.size();
    }
}
