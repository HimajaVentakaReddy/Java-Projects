import java.util.Scanner;

public class StudentPassFailChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("    STUDENT PASS/FAIL CHECKER");
        System.out.println("================================");

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter USN: ");
        String usn = scanner.nextLine();

        System.out.print("Enter marks out of 100: ");
        double marks = scanner.nextDouble();

        System.out.println("\n--------- STUDENT RESULT ---------");
        System.out.println("Student Name : " + studentName);
        System.out.println("USN          : " + usn);
        System.out.printf("Marks        : %.2f%n", marks);

        if (marks >= 35) {
            System.out.println("Result       : PASS");
        } else {
            System.out.println("Result       : FAIL");
        }

        System.out.println("----------------------------------");

        scanner.close();
    }
}