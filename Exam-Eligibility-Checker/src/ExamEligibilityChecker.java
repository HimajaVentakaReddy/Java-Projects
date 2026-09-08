import java.util.Scanner;

public class ExamEligibilityChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("     EXAM ELIGIBILITY CHECKER");
        System.out.println("==================================");

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student USN: ");
        String usn = scanner.nextLine();

        System.out.print("Enter attendance percentage: ");
        double attendance = scanner.nextDouble();

        System.out.print("Enter internal marks: ");
        double marks = scanner.nextDouble();

        System.out.print("Are examination fees paid? (yes/no): ");
        String feesPaid = scanner.next();

        System.out.println();
        System.out.println("==================================");
        System.out.println("       ELIGIBILITY REPORT");
        System.out.println("==================================");
        System.out.println("Student Name : " + name);
        System.out.println("Student USN  : " + usn);
        System.out.println("Attendance   : " + attendance + "%");
        System.out.println("Marks        : " + marks);
        System.out.println("----------------------------------");

        if (attendance >= 75 &&
                marks >= 40 &&
                feesPaid.equalsIgnoreCase("yes")) {

            System.out.println("Result: ELIGIBLE");
            System.out.println("You can attend the examination.");

        } else {

            System.out.println("Result: NOT ELIGIBLE");
            System.out.println("Reason:");

            if (attendance < 75) {
                System.out.println("- Attendance is below 75%.");
            }

            if (marks < 40) {
                System.out.println("- Internal marks are below 40.");
            }

            if (!feesPaid.equalsIgnoreCase("yes")) {
                System.out.println("- Examination fees are not paid.");
            }
        }

        System.out.println("==================================");

        scanner.close();
    }
}