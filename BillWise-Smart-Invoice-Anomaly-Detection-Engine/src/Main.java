import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final BillWiseEngine ENGINE = new BillWiseEngine();
    private static final ReportGenerator REPORT_GENERATOR =
            new ReportGenerator();

    public static void main(String[] args) {
        boolean running = true;

        printWelcomeMessage();

        while (running) {
            printMenu();
            int choice = readInteger("Enter your choice: ");

            switch (choice) {
                case 1:
                    addInvoice();
                    break;
                case 2:
                    loadSampleInvoices();
                    break;
                case 3:
                    viewInvoices();
                    break;
                case 4:
                    analyzeInvoices();
                    break;
                case 5:
                    generateReport();
                    break;
                case 6:
                    displaySystemInformation();
                    break;
                case 7:
                    running = false;
                    System.out.println(
                            "\nThank you for using BillWise. Goodbye!"
                    );
                    break;
                default:
                    System.out.println(
                            "\nInvalid choice. Please select from 1 to 7."
                    );
            }
        }

        SCANNER.close();
    }

    private static void printWelcomeMessage() {
        System.out.println(
                "\n============================================================"
        );
        System.out.println(
                "       BILLWISE - SMART INVOICE ANOMALY DETECTOR"
        );
        System.out.println(
                "============================================================"
        );
        System.out.println(
                "Detect duplicate, suspicious and inconsistent invoices."
        );
    }

    private static void printMenu() {
        System.out.println(
                "\n======================= MAIN MENU =========================="
        );
        System.out.println("1. Add Invoice");
        System.out.println("2. Load Sample Invoice Data");
        System.out.println("3. View All Invoices");
        System.out.println("4. Detect Invoice Anomalies");
        System.out.println("5. Generate Analysis Report");
        System.out.println("6. About BillWise");
        System.out.println("7. Exit");
        System.out.println(
                "============================================================"
        );
    }

    private static void addInvoice() {
        System.out.println("\n---------------- ADD INVOICE ----------------");

        String invoiceNumber = readText("Invoice number: ");
        String vendorName = readText("Vendor name: ");
        LocalDate invoiceDate = readDate(
                "Invoice date (yyyy-MM-dd): "
        );
        double subtotal = readDouble("Subtotal amount: ");
        double taxAmount = readDouble("Tax amount: ");
        double totalAmount = readDouble("Total amount: ");

        Invoice invoice = new Invoice(
                invoiceNumber,
                vendorName,
                invoiceDate,
                subtotal,
                taxAmount,
                totalAmount
        );

        ENGINE.addInvoice(invoice);
        System.out.println("\nInvoice added successfully.");
    }

    private static void loadSampleInvoices() {
        if (ENGINE.hasInvoices()) {
            System.out.println(
                    "\nInvoices already exist. Sample data was not loaded again."
            );
            return;
        }

        ENGINE.addInvoice(new Invoice(
                "INV-1001",
                "TechNova Solutions",
                LocalDate.now().minusDays(20),
                10000.00,
                1800.00,
                11800.00
        ));

        ENGINE.addInvoice(new Invoice(
                "INV-1002",
                "GreenLeaf Supplies",
                LocalDate.now().minusDays(12),
                15000.00,
                2700.00,
                17700.00
        ));

        ENGINE.addInvoice(new Invoice(
                "INV-1003",
                "DataCore Systems",
                LocalDate.now().minusDays(8),
                60000.00,
                10800.00,
                70800.00
        ));

        ENGINE.addInvoice(new Invoice(
                "INV-1004",
                "QuickOffice Traders",
                LocalDate.now().minusDays(5),
                8000.00,
                500.00,
                8500.00
        ));

        ENGINE.addInvoice(new Invoice(
                "INV-1002",
                "GreenLeaf Supplies",
                LocalDate.now().minusDays(12),
                15000.00,
                2700.00,
                17700.00
        ));

        ENGINE.addInvoice(new Invoice(
                "INV-1005",
                "",
                LocalDate.now().plusDays(10),
                5000.00,
                900.00,
                5900.00
        ));

        System.out.println("\nSample invoice data loaded successfully.");
        System.out.println("Invoices loaded: " + ENGINE.getInvoiceCount());
    }

    private static void viewInvoices() {
        if (!ENGINE.hasInvoices()) {
            System.out.println(
                    "\nNo invoices available. Add or load invoices first."
            );
            return;
        }

        System.out.println(
                "\n===================== INVOICE RECORDS ======================"
        );
        System.out.println(
                "Invoice No.  | Vendor               | Date       |   Subtotal |       Tax |       Total"
        );
        System.out.println(
                "------------------------------------------------------------------------------------------"
        );

        for (Invoice invoice : ENGINE.getInvoices()) {
            System.out.println(invoice);
        }

        System.out.println(
                "------------------------------------------------------------------------------------------"
        );
        System.out.println(
                "Total invoices: " + ENGINE.getInvoiceCount()
        );
        System.out.printf(
                "Average amount: %.2f%n",
                ENGINE.getAverageInvoiceAmount()
        );
    }

    private static void analyzeInvoices() {
        if (!ENGINE.hasInvoices()) {
            System.out.println(
                    "\nNo invoices available. Add or load invoices first."
            );
            return;
        }

        List<Anomaly> anomalies = ENGINE.analyzeInvoices();

        System.out.println(
                "\n==================== ANOMALY RESULTS ======================="
        );

        if (anomalies.isEmpty()) {
            System.out.println("No anomalies detected.");
        } else {
            for (int index = 0; index < anomalies.size(); index++) {
                System.out.println(
                        (index + 1) + ". " + anomalies.get(index)
                );
            }
        }

        System.out.println(
                "============================================================"
        );
        System.out.println(
                "Total anomalies detected: " + anomalies.size()
        );
    }

    private static void generateReport() {
        if (!ENGINE.hasInvoices()) {
            System.out.println(
                    "\nNo invoices available. Add or load invoices first."
            );
            return;
        }

        List<Anomaly> anomalies = ENGINE.analyzeInvoices();

        String report = REPORT_GENERATOR.generateReport(
                ENGINE.getInvoices(),
                anomalies,
                ENGINE.getAverageInvoiceAmount()
        );

        try {
            REPORT_GENERATOR.saveReport(report);
            System.out.println(
                    "\nReport generated successfully: "
                            + REPORT_GENERATOR.getReportFileName()
            );
        } catch (Exception exception) {
            System.out.println(
                    "\nUnable to generate report: "
                            + exception.getMessage()
            );
        }
    }

    private static void displaySystemInformation() {
        System.out.println(
                "\n===================== ABOUT BILLWISE ======================="
        );
        System.out.println(
                "BillWise is a Java-based invoice anomaly detection engine."
        );
        System.out.println(
                "It identifies duplicate invoices, invalid amounts,"
        );
        System.out.println(
                "future dates, tax mismatches, missing vendors and unusually"
        );
        System.out.println(
                "high invoice values using rule-based analysis."
        );
        System.out.println(
                "============================================================"
        );
    }

    private static int readInteger(String message) {
        while (true) {
            System.out.print(message);

            try {
                return Integer.parseInt(SCANNER.nextLine().trim());
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid whole number.");
            }
        }
    }

    private static double readDouble(String message) {
        while (true) {
            System.out.print(message);

            try {
                return Double.parseDouble(SCANNER.nextLine().trim());
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid amount.");
            }
        }
    }

    private static LocalDate readDate(String message) {
        while (true) {
            System.out.print(message);

            try {
                return LocalDate.parse(SCANNER.nextLine().trim());
            } catch (DateTimeParseException exception) {
                System.out.println(
                        "Please use the yyyy-MM-dd date format."
                );
            }
        }
    }

    private static String readText(String message) {
        System.out.print(message);
        return SCANNER.nextLine().trim();
    }
}
