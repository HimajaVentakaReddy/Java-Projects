import java.util.Scanner;

public class ATMCashDenominationCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter withdrawal amount (Rs.): ");
        int amount = sc.nextInt();

        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else {
            int notes500 = amount / 500;
            amount %= 500;

            int notes200 = amount / 200;
            amount %= 200;

            int notes100 = amount / 100;
            amount %= 100;

            int notes50 = amount / 50;
            amount %= 50;

            System.out.println("\n===== CASH DENOMINATION =====");
            System.out.println("Rs. 500 notes: " + notes500);
            System.out.println("Rs. 200 notes: " + notes200);
            System.out.println("Rs. 100 notes: " + notes100);
            System.out.println("Rs. 50 notes: " + notes50);
            System.out.println("Remaining amount: Rs. " + amount);
        }

        sc.close();
    }
}

