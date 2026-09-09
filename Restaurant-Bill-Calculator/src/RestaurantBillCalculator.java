import java.util.Scanner;

public class RestaurantBillCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double GST_RATE = 5.0;
        final double DISCOUNT_RATE = 10.0;
        final double DISCOUNT_LIMIT = 500.0;

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

        if (price <= 0 || quantity <= 0) {
            System.out.println("\nInvalid input!");
            System.out.println("Price and quantity must be greater than zero.");
        } else {
            double subtotal = price * quantity;
            double discount = 0;

            if (subtotal >= DISCOUNT_LIMIT) {
                discount = subtotal * DISCOUNT_RATE / 100;
            }

            double amountAfterDiscount = subtotal - discount;
            double gst = amountAfterDiscount * GST_RATE / 100;
            double finalAmount = amountAfterDiscount + gst;

            System.out.println("\n============ BILL RECEIPT ============");
            System.out.println("Customer Name : " + customerName);
            System.out.println("Food Item     : " + foodItem);
            System.out.printf("Item Price    : Rs. %.2f%n", price);
            System.out.println("Quantity      : " + quantity);
            System.out.println("--------------------------------------");
            System.out.printf("Subtotal      : Rs. %.2f%n", subtotal);
            System.out.printf("Discount      : Rs. %.2f%n", discount);
            System.out.printf("GST (5%%)      : Rs. %.2f%n", gst);
            System.out.println("--------------------------------------");
            System.out.printf("Final Amount  : Rs. %.2f%n", finalAmount);
            System.out.println("======================================");
            System.out.println("Thank you! Please visit again.");
        }

        scanner.close();
    }
}