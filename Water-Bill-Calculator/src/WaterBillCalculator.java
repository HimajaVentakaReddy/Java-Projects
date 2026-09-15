import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double serviceCharge = 50.00;

        System.out.println("======================================");
        System.out.println("         WATER BILL CALCULATOR");
        System.out.println("======================================");

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine().trim();

        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine().trim().toUpperCase();

        System.out.print("Enter water consumed in kilolitres: ");
        double waterConsumed = scanner.nextDouble();

        if (customerName.isEmpty() || customerId.isEmpty()) {
            System.out.println("\nInvalid input: Customer details are required.");
            scanner.close();
            return;
        }

        if (waterConsumed < 0) {
            System.out.println("\nInvalid input: Water consumption cannot be negative.");
            scanner.close();
            return;
        }

        double consumptionCharge;

        if (waterConsumed <= 10) {
            consumptionCharge = waterConsumed * 5.00;
        } else if (waterConsumed <= 20) {
            consumptionCharge = (10 * 5.00)
                    + ((waterConsumed - 10) * 8.00);
        } else {
            consumptionCharge = (10 * 5.00)
                    + (10 * 8.00)
                    + ((waterConsumed - 20) * 12.00);
        }

        String usageStatus;
        String suggestion;

        if (waterConsumed <= 10) {
            usageStatus = "LOW USAGE";
            suggestion = "Excellent! Continue conserving water.";
        } else if (waterConsumed <= 20) {
            usageStatus = "MODERATE USAGE";
            suggestion = "Monitor your daily water consumption.";
        } else {
            usageStatus = "HIGH USAGE";
            suggestion = "Reduce unnecessary water consumption.";
        }

        double totalBill = consumptionCharge + serviceCharge;

        System.out.println("\n------------- WATER BILL -------------");
        System.out.println("Customer Name      : " + customerName);
        System.out.println("Customer ID        : " + customerId);
        System.out.printf("Water Consumed     : %.2f KL%n", waterConsumed);
        System.out.println("Usage Status       : " + usageStatus);
        System.out.printf("Consumption Charge : Rs. %.2f%n",
                consumptionCharge);
        System.out.printf("Service Charge     : Rs. %.2f%n",
                serviceCharge);
        System.out.println("--------------------------------------");
        System.out.printf("Total Water Bill   : Rs. %.2f%n", totalBill);
        System.out.println("--------------------------------------");
        System.out.println("Suggestion: " + suggestion);
        System.out.println("======================================");

        scanner.close();
    }
}