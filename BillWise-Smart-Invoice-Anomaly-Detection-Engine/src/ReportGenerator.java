import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReportGenerator {
    private static final String REPORT_FILE = "BillWise_Anomaly_Report.txt";

    public String generateReport(
            List<Invoice> invoices,
            List<Anomaly> anomalies,
            double averageAmount) {

        StringBuilder report = new StringBuilder();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        report.append("============================================================\n");
        report.append("        BILLWISE - INVOICE ANOMALY ANALYSIS REPORT\n");
        report.append("============================================================\n");
        report.append("Generated on       : ")
                .append(LocalDateTime.now().format(formatter))
                .append("\n");
        report.append("Invoices analyzed  : ")
                .append(invoices.size())
                .append("\n");
        report.append("Anomalies detected : ")
                .append(anomalies.size())
                .append("\n");
        report.append(String.format(
                "Average invoice    : %.2f%n",
                averageAmount
        ));
        report.append("============================================================\n\n");

        report.append("INVOICE DETAILS\n");
        report.append("------------------------------------------------------------\n");

        for (Invoice invoice : invoices) {
            report.append(invoice).append("\n");
        }

        report.append("\nANOMALY DETAILS\n");
        report.append("------------------------------------------------------------\n");

        if (anomalies.isEmpty()) {
            report.append("No anomalies were detected.\n");
        } else {
            for (int index = 0; index < anomalies.size(); index++) {
                report.append(index + 1)
                        .append(". ")
                        .append(anomalies.get(index))
                        .append("\n");
            }
        }

        report.append("\n============================================================\n");
        report.append("                    END OF REPORT\n");
        report.append("============================================================\n");

        return report.toString();
    }

    public void saveReport(String report) throws IOException {
        Files.writeString(Path.of(REPORT_FILE), report);
    }

    public String getReportFileName() {
        return REPORT_FILE;
    }
}
