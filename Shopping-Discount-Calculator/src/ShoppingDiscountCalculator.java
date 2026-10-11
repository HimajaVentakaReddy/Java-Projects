import java.util.Scanner;

public class ShoppingDiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Shopping Discount Calculator ===");

        System.out.print("Enter original price (Rs.): ");
        double price = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        if (price <= 0 || discount < 0 || discount > 100) {
            System.out.println("Invalid input! Price must be positive and discount must be 0-100.");
        } else {
            double savings = price * discount / 100;
            double finalPrice = price - savings;

            System.out.printf("Discount amount: Rs. %.2f%n", savings);
            System.out.printf("Final price: Rs. %.2f%n", finalPrice);
        }

        sc.close();
    }
}