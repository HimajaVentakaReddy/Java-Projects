import java.util.Scanner;

public class BloodDonationEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   BLOOD DONATION ELIGIBILITY CHECKER");
        System.out.println("========================================");

        System.out.print("Enter donor name: ");
        String donorName = scanner.nextLine();

        System.out.print("Enter donor age: ");
        int age = scanner.nextInt();

        System.out.println("\n---------- ELIGIBILITY RESULT ----------");
        System.out.println("Donor Name : " + donorName);
        System.out.println("Age        : " + age);

        if (age >= 18 && age <= 65) {
            System.out.println("Status     : ELIGIBLE BY AGE");
            System.out.println("Message    : You satisfy the age requirement.");
        } else if (age < 18) {
            int remainingYears = 18 - age;

            System.out.println("Status     : NOT ELIGIBLE");
            System.out.println("Reason     : Minimum age is 18 years.");
            System.out.println("Wait Time  : " + remainingYears
                    + " year(s)");
        } else {
            System.out.println("Status     : NOT ELIGIBLE");
            System.out.println("Reason     : Maximum age for this checker is 65.");
        }

        System.out.println("----------------------------------------");

        scanner.close();
    }
}