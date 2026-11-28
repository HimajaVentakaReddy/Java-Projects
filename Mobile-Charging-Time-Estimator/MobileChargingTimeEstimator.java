import java.util.Scanner;

public class MobileChargingTimeEstimator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter battery capacity (mAh): ");
        double capacity = sc.nextDouble();

        System.out.print("Enter charger output (mA): ");
        double charger = sc.nextDouble();

        System.out.print("Enter current battery percentage: ");
        double percentage = sc.nextDouble();

        if (capacity <= 0 || charger <= 0 || percentage < 0 || percentage >= 100) {
            System.out.println("Invalid input!");
        } else {
            double remaining = capacity * (100 - percentage) / 100;
            double time = remaining / charger;

            System.out.printf("Estimated charging time: %.2f hours%n", time);
        }

        sc.close();
    }
}
