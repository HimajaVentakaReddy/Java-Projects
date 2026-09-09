import java.util.Scanner;

public class RestaurantBillCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("      RESTAURANT BILL CALCULATOR");
        System.out.println("======================================");

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter food item name: ");
        String foodItem = scanner.nextLine();

        System.out.print("Enter price of one item: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        if (price < 0 || quantity <= 0) {
            System.out.println("Invalid price or quantity.");
        } else {
            double totalBill = price * quantity;

            System.out.println("\n========== BILL RECEIPT ==========");
            System.out.println("Customer Name : " + customerName);
            System.out.println("Food Item     : " + foodItem);
            System.out.printf("Item Price    : Rs. %.2f%n", price);
            System.out.println("Quantity      : " + quantity);
            System.out.println("----------------------------------");
            System.out.printf("Total Bill    : Rs. %.2f%n", totalBill);
            System.out.println("==================================");
            System.out.println("Thank you! Please visit again.");
        }

        scanner.close();
    }
}