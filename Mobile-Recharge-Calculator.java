import java.util.Scanner;

public class MobileRechargeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter recharge amount: ");
        double amount = sc.nextDouble();

        System.out.println("Recharge Amount: Rs. " + amount);

        sc.close();
    }
}
