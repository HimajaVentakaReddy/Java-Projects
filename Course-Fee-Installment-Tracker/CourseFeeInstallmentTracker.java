import java.util.Scanner;

public class CourseFeeInstallmentTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== COURSE FEE INSTALLMENT TRACKER =====");

        System.out.print("Enter total course fee (Rs.): ");
        double totalFee = sc.nextDouble();

        System.out.print("Enter amount already paid (Rs.): ");
        double paid = sc.nextDouble();

        System.out.print("Enter remaining installment months: ");
        int months = sc.nextInt();

        if (totalFee <= 0 || paid < 0 || paid > totalFee || months <= 0) {
            System.out.println("Invalid input!");
        } else {
            double remaining = totalFee - paid;
            double installment = remaining / months;

            System.out.println("\n===== FEE REPORT =====");
            System.out.println("Total Fee: Rs. " + totalFee);
            System.out.println("Amount Paid: Rs. " + paid);
            System.out.println("Remaining Fee: Rs. " + remaining);
            System.out.printf("Monthly Installment: Rs. %.2f%n", installment);

            if (remaining == 0) {
                System.out.println("Fee Status: Fully Paid");
            } else {
                System.out.println("Fee Status: Payment Pending");
            }
        }

        sc.close();
    }
}
