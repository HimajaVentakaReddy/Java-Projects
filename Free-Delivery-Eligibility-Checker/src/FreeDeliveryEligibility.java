import java.util.Scanner;

public class FreeDeliveryEligibility {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("     FREE DELIVERY ELIGIBILITY CHECKER");
        System.out.println("==========================================");

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.println("\nSelect an order category:");
        System.out.println("1. Food");
        System.out.println("2. Clothes");
        System.out.println("3. Electronics");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        String category;
        double minimumAmount;
        double deliveryCharge;

        switch (choice) {
            case 1:
                category = "Food";
                minimumAmount = 299;
                deliveryCharge = 40;
                break;

            case 2:
                category = "Clothes";
                minimumAmount = 499;
                deliveryCharge = 60;
                break;

            case 3:
                category = "Electronics";
                minimumAmount = 999;
                deliveryCharge = 100;
                break;

            default:
                System.out.println("\nInvalid category choice.");
                scanner.close();
                return;
        }

        System.out.print("Enter order amount: Rs. ");
        double orderAmount = scanner.nextDouble();

        if (orderAmount <= 0) {
            System.out.println("\nInvalid order amount.");
            System.out.println("Order amount must be greater than zero.");
            scanner.close();
            return;
        }

        double finalAmount;

        System.out.println("\n==========================================");
        System.out.println("              ORDER SUMMARY");
        System.out.println("==========================================");
        System.out.println("Customer Name   : " + customerName);
        System.out.println("Order Category  : " + category);
        System.out.printf("Order Amount    : Rs. %.2f%n", orderAmount);

        if (orderAmount >= minimumAmount) {
            deliveryCharge = 0;
            finalAmount = orderAmount;

            System.out.println("Delivery Status : FREE DELIVERY");
        } else {
            finalAmount = orderAmount + deliveryCharge;
            double remainingAmount = minimumAmount - orderAmount;

            System.out.println("Delivery Status : DELIVERY CHARGE APPLIED");
            System.out.printf("Add Rs. %.2f more to receive free delivery.%n",
                    remainingAmount);
        }

        System.out.printf("Delivery Charge : Rs. %.2f%n", deliveryCharge);
        System.out.printf("Final Amount    : Rs. %.2f%n", finalAmount);
        System.out.println("==========================================");

        scanner.close();
    }
}