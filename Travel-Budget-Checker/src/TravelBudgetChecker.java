import java.util.Scanner;

public class TravelBudgetChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Travel Budget Checker ===");

        System.out.print("Enter total travel budget (Rs.): ");
        double budget = sc.nextDouble();

        System.out.print("Enter transport expense (Rs.): ");
        double transport = sc.nextDouble();

        System.out.print("Enter hotel expense (Rs.): ");
        double hotel = sc.nextDouble();

        System.out.print("Enter food expense (Rs.): ");
        double food = sc.nextDouble();

        System.out.print("Enter other expenses (Rs.): ");
        double other = sc.nextDouble();

        if (budget <= 0 || transport < 0 || hotel < 0
                || food < 0 || other < 0) {
            System.out.println("Invalid input! Budget must be positive and expenses cannot be negative.");
        } else {
            double total = transport + hotel + food + other;
            double balance = budget - total;

            System.out.printf("Total expenses: Rs. %.2f%n", total);

            if (balance >= 0) {
                System.out.printf("Remaining budget: Rs. %.2f%n", balance);
                System.out.println("Status: Within budget!");
            } else {
                System.out.printf("Budget exceeded by: Rs. %.2f%n", -balance);
                System.out.println("Status: Over budget!");
            }
        }

        sc.close();
    }
}