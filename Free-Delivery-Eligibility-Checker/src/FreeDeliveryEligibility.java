import java.util.Scanner;

public class FreeDeliveryEligibility {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("     FREE DELIVERY ELIGIBILITY CHECKER");
        System.out.println("==========================================");

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter order amount: Rs. ");
        double orderAmount = scanner.nextDouble();

        if (orderAmount >= 499) {
            System.out.println("\nHello, " + customerName + "!");
            System.out.println("Congratulations! You are eligible for free delivery.");
        } else {
            double remainingAmount = 499 - orderAmount;

            System.out.println("\nHello, " + customerName + "!");
            System.out.println("You are not eligible for free delivery.");
            System.out.printf("Add items worth Rs. %.2f more to get free delivery.%n",
                    remainingAmount);
        }

        scanner.close();
    }
}