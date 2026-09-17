import java.util.Scanner;

public class StudentPassFailChecker {
    public static String getSubjectResult(double marks) {
        return marks >= 35 ? "PASS" : "FAIL";
    }

    public static String getGrade(double average, boolean passedAll) {
        if (!passedAll) {
            return "F";
        } else if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       STUDENT PASS/FAIL CHECKER");
        System.out.println("========================================");

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine().trim();

        System.out.print("Enter USN: ");
        String usn = scanner.nextLine().trim().toUpperCase();

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

        if (studentName.isEmpty() || usn.isEmpty()) {
            System.out.println("\nInvalid input: Student name and USN are required.");
            scanner.close();
            return;
        }

        if (javaMarks < 0 || javaMarks > 100
                || dbmsMarks < 0 || dbmsMarks > 100
                || osMarks < 0 || osMarks > 100
                || daaMarks < 0 || daaMarks > 100
                || mcMarks < 0 || mcMarks > 100) {
            System.out.println("\nInvalid input: Marks must be between 0 and 100.");
            scanner.close();
            return;
        }

        double totalMarks = javaMarks + dbmsMarks + osMarks
                + daaMarks + mcMarks;
        double averageMarks = totalMarks / 5;

        int failedSubjects = 0;

        if (javaMarks < 35) {
            failedSubjects++;
        }
        if (dbmsMarks < 35) {
            failedSubjects++;
        }
        if (osMarks < 35) {
            failedSubjects++;
        }
        if (daaMarks < 35) {
            failedSubjects++;
        }
        if (mcMarks < 35) {
            failedSubjects++;
        }

        boolean passedAllSubjects = failedSubjects == 0;
        String grade = getGrade(averageMarks, passedAllSubjects);

        System.out.println("\n-------------- RESULT REPORT --------------");
        System.out.println("Student Name      : " + studentName);
        System.out.println("USN               : " + usn);
        System.out.println("-------------------------------------------");
        System.out.printf("Java              : %6.2f  %s%n",
                javaMarks, getSubjectResult(javaMarks));
        System.out.printf("DBMS              : %6.2f  %s%n",
                dbmsMarks, getSubjectResult(dbmsMarks));
        System.out.printf("Operating Systems : %6.2f  %s%n",
                osMarks, getSubjectResult(osMarks));
        System.out.printf("DAA               : %6.2f  %s%n",
                daaMarks, getSubjectResult(daaMarks));
        System.out.printf("Microcontroller   : %6.2f  %s%n",
                mcMarks, getSubjectResult(mcMarks));
        System.out.println("-------------------------------------------");
        System.out.printf("Total Marks       : %.2f / 500%n", totalMarks);
        System.out.printf("Average Percentage: %.2f%%%n", averageMarks);
        System.out.println("Failed Subjects   : " + failedSubjects);
        System.out.println("Grade             : " + grade);

        if (passedAllSubjects) {
            System.out.println("Overall Result    : PASS");

            if (averageMarks >= 75) {
                System.out.println("Performance       : DISTINCTION");
            } else if (averageMarks >= 60) {
                System.out.println("Performance       : FIRST CLASS");
            } else if (averageMarks >= 50) {
                System.out.println("Performance       : SECOND CLASS");
            } else {
                System.out.println("Performance       : PASS CLASS");
            }
        } else {
            System.out.println("Overall Result    : FAIL");
            System.out.println("Suggestion        : Improve the failed subjects.");
        }

        System.out.println("===========================================");

        scanner.close();
    }
}