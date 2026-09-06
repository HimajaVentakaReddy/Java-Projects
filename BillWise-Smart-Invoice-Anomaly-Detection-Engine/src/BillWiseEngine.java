import java.util.List;

public class BillWiseEngine {
    private final InvoiceRepository repository;
    private final AnomalyDetector anomalyDetector;

    public BillWiseEngine() {
        repository = new InvoiceRepository();
        anomalyDetector = new AnomalyDetector();
    }

    public void addInvoice(Invoice invoice) {
        repository.addInvoice(invoice);
    }

    public List<Invoice> getInvoices() {
        return repository.getAllInvoices();
    }

    public List<Anomaly> analyzeInvoices() {
        return anomalyDetector.detectAnomalies(repository);
    }

    public int getInvoiceCount() {
        return repository.size();
    }

    public double getAverageInvoiceAmount() {
        return repository.calculateAverageTotal();
    }

    public boolean hasInvoices() {
        return !repository.isEmpty();
    }
}
