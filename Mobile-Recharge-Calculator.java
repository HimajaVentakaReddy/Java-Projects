import java.util.Scanner;

public class MobileRechargeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter recharge amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid recharge amount.");
        } else {
            System.out.println("Recharge Amount: Rs. " + amount);
        }

        sc.close();
    }
}
