import java.util.Scanner;

public class ExamEligibilityChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("     EXAM ELIGIBILITY CHECKER");
        System.out.println("==================================");

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter attendance percentage: ");
        double attendance = scanner.nextDouble();

        System.out.print("Enter internal marks: ");
        double marks = scanner.nextDouble();

        System.out.println();
        System.out.println("Student Name: " + name);

        if (attendance >= 75 && marks >= 40) {
            System.out.println("Result: Eligible for the examination");
        } else {
            System.out.println("Result: Not eligible for the examination");
        }

        scanner.close();
    }
}
