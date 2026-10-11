import java.util.Scanner;

public class ElectricityUsageAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Electricity Usage Alert ===");

        System.out.print("Enter electricity units consumed: ");
        double units = sc.nextDouble();

        System.out.print("Enter alert threshold in units: ");
        double threshold = sc.nextDouble();

        if (units < 0 || threshold <= 0) {
            System.out.println("Invalid input! Units cannot be negative and threshold must be positive.");
        } else {
            double rate;

            if (units <= 100) {
                rate = 1.50;
            } else if (units <= 200) {
                rate = 2.50;
            } else {
                rate = 4.00;
            }

            double bill = units * rate;

            System.out.printf("Estimated bill: Rs. %.2f%n", bill);

            if (units > threshold) {
                System.out.println("ALERT: Electricity usage exceeded your threshold!");
            } else {
                System.out.println("Usage is within your threshold.");
            }
        }

        sc.close();
    }
}