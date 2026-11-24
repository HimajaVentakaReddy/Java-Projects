
import java.util.Scanner;

public class DailyWaterIntakeLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] intake = new double[7];
        double total = 0;

        System.out.println("===== DAILY WATER INTAKE LOGGER =====");

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter water intake for Day "
                    + (i + 1) + " in litres: ");

            intake[i] = sc.nextDouble();

            if (intake[i] < 0) {
                System.out.println("Invalid water intake!");
                sc.close();
                return;
            }

            total += intake[i];
        }

        double average = total / 7;

        System.out.println("\n===== WEEKLY WATER REPORT =====");

        for (int i = 0; i < 7; i++) {
            System.out.println("Day " + (i + 1)
                    + ": " + intake[i] + " litres");
        }

        System.out.printf("Total Intake: %.2f litres%n", total);
        System.out.printf("Daily Average: %.2f litres%n", average);

        System.out.println("Weekly tracking completed!");

        sc.close();
    }
}
