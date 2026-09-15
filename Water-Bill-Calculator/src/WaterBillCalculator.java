import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double ratePerKilolitre = 15.00;

        System.out.println("================================");
        System.out.println("       WATER BILL CALCULATOR");
        System.out.println("================================");

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();

        System.out.print("Enter water consumed in kilolitres: ");
        double waterConsumed = scanner.nextDouble();

        double waterBill = waterConsumed * ratePerKilolitre;

        System.out.println("\n---------- WATER BILL ----------");
        System.out.println("Customer Name    : " + customerName);
        System.out.println("Customer ID      : " + customerId);
        System.out.printf("Water Consumed   : %.2f KL%n", waterConsumed);
        System.out.printf("Rate             : Rs. %.2f per KL%n",
                ratePerKilolitre);
        System.out.printf("Total Water Bill : Rs. %.2f%n", waterBill);
        System.out.println("--------------------------------");

        scanner.close();
    }
}