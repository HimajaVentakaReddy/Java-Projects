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

        System.out.print("Enter order amount: Rs. ");
        double orderAmount = scanner.nextDouble();

        String category;
        double minimumAmount;

        switch (choice) {
            case 1:
                category = "Food";
                minimumAmount = 299;
                break;

            case 2:
                category = "Clothes";
                minimumAmount = 499;
                break;

            case 3:
                category = "Electronics";
                minimumAmount = 999;
                break;

            default:
                System.out.println("\nInvalid category choice.");
                scanner.close();
                return;
        }

        System.out.println("\nHello, " + customerName + "!");
        System.out.println("Order Category: " + category);
        System.out.printf("Order Amount: Rs. %.2f%n", orderAmount);

        if (orderAmount >= minimumAmount) {
            System.out.println("Congratulations! You are eligible for free delivery.");
        } else {
            double remainingAmount = minimumAmount - orderAmount;

            System.out.println("You are not eligible for free delivery.");
            System.out.printf(
                    "Add items worth Rs. %.2f more to get free delivery.%n",
                    remainingAmount);
        }

        scanner.close();
    }
}