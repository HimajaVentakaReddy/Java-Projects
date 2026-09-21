import java.util.Scanner;

public class ScholarshipEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double minimumPercentage = 75.00;

        System.out.println("========================================");
        System.out.println("    SCHOLARSHIP ELIGIBILITY CHECKER");
        System.out.println("========================================");

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter USN: ");
        String usn = scanner.nextLine();

        System.out.print("Enter academic percentage: ");
        double percentage = scanner.nextDouble();

        System.out.println("\n---------- ELIGIBILITY RESULT ----------");
        System.out.println("Student Name : " + studentName);
        System.out.println("USN          : " + usn);
        System.out.printf("Percentage   : %.2f%%%n", percentage);

        if (percentage >= minimumPercentage) {
            System.out.println("Status       : ELIGIBLE");
            System.out.println("Message      : Academic requirement satisfied.");
        } else {
            double requiredPercentage = minimumPercentage - percentage;

            System.out.println("Status       : NOT ELIGIBLE");
            System.out.println("Reason       : Minimum percentage is 75%.");
            System.out.printf("Improvement  : %.2f%% more required%n",
                    requiredPercentage);
        }

        System.out.println("----------------------------------------");

        scanner.close();
    }
}