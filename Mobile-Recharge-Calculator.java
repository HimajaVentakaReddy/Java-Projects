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

            if (plan == 1) {
                System.out.println("Prepaid Recharge: Rs. " + amount);
            } else if (plan == 2) {
                System.out.println("Data Recharge: Rs. " + amount);
            } else {
                System.out.println("Invalid plan type.");
            }
        }

        sc.close();
    }
}
