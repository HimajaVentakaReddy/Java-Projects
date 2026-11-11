import java.util.Scanner;

public class BusPassValidityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== BUS PASS VALIDITY CHECKER =====");

        System.out.print("Enter pass validity in days: ");
        int validity = sc.nextInt();

        System.out.print("Enter days passed since issue: ");
        int passed = sc.nextInt();

        if (validity <= 0 || passed < 0) {
            System.out.println("Invalid input!");
        } else {
            int remaining = validity - passed;

            System.out.println("\n===== BUS PASS REPORT =====");
            System.out.println("Pass Validity: " + validity + " days");
            System.out.println("Days Passed: " + passed);

            if (remaining > 0) {
                System.out.println("Remaining Days: " + remaining);
                System.out.println("Pass Status: Valid");
            } else if (remaining == 0) {
                System.out.println("Pass Status: Expires today");
            } else {
                System.out.println("Expired Days: " + Math.abs(remaining));
                System.out.println("Pass Status: Expired");
            }
        }

        sc.close();
    }
}
