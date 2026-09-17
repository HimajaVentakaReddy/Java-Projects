import java.util.Scanner;

public class StudentPassFailChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("      STUDENT PASS/FAIL CHECKER");
        System.out.println("======================================");

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter USN: ");
        String usn = scanner.nextLine();

        System.out.print("Enter Java marks: ");
        double javaMarks = scanner.nextDouble();

        System.out.print("Enter DBMS marks: ");
        double dbmsMarks = scanner.nextDouble();

        System.out.print("Enter Operating Systems marks: ");
        double osMarks = scanner.nextDouble();

        System.out.print("Enter DAA marks: ");
        double daaMarks = scanner.nextDouble();

        System.out.print("Enter Microcontroller marks: ");
        double mcMarks = scanner.nextDouble();

        double totalMarks = javaMarks + dbmsMarks + osMarks
                + daaMarks + mcMarks;
        double averageMarks = totalMarks / 5;

        boolean passedAllSubjects = javaMarks >= 35
                && dbmsMarks >= 35
                && osMarks >= 35
                && daaMarks >= 35
                && mcMarks >= 35;

        System.out.println("\n------------ RESULT SUMMARY ------------");
        System.out.println("Student Name       : " + studentName);
        System.out.println("USN                : " + usn);
        System.out.printf("Java               : %.2f%n", javaMarks);
        System.out.printf("DBMS               : %.2f%n", dbmsMarks);
        System.out.printf("Operating Systems  : %.2f%n", osMarks);
        System.out.printf("DAA                : %.2f%n", daaMarks);
        System.out.printf("Microcontroller    : %.2f%n", mcMarks);
        System.out.println("----------------------------------------");
        System.out.printf("Total Marks        : %.2f / 500%n", totalMarks);
        System.out.printf("Average Percentage : %.2f%%%n", averageMarks);

        if (passedAllSubjects) {
            System.out.println("Overall Result     : PASS");
        } else {
            System.out.println("Overall Result     : FAIL");
        }

        System.out.println("========================================");

        scanner.close();
    }
}