import java.util.Scanner;

public class MobileRechargeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter recharge amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid recharge amount.");
        } else {
            System.out.print("Enter plan type (1-Prepaid, 2-Data): ");
            int plan = sc.nextInt();

            System.out.print("Enter validity days: ");
            int days = sc.nextInt();

            if (plan == 1 && days > 0) {
                System.out.println("Prepaid Recharge: Rs. " + amount);
                System.out.println("Validity: " + days + " days");
            } else if (plan == 2 && days > 0) {
                System.out.println("Data Recharge: Rs. " + amount);
                System.out.println("Validity: " + days + " days");
            } else {
                System.out.println("Invalid plan or validity.");
            }
        }

        sc.close();
    }
}
