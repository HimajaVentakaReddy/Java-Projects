import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Electricity Bill Calculator ===");

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter units consumed: ");
        int units = scanner.nextInt();

        if (units < 0) {
            System.out.println("Invalid input! Units cannot be negative.");
        } else {
            double bill;

            if (units <= 100) {
                bill = units * 1.50;
            } else if (units <= 200) {
                bill = units * 2.50;
            } else {
                bill = units * 4.00;
            }

            System.out.println();
            System.out.println("------ Electricity Bill ------");
            System.out.println("Customer Name: " + name);
            System.out.println("Units Consumed: " + units);
            System.out.println("Electricity Bill: Rs. " + bill);
            System.out.println("------------------------------");
        }

        scanner.close();
    }
}