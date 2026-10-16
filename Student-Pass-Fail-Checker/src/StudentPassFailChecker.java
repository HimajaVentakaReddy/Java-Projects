import java.util.Scanner;

public class StudentPassFailChecker {
    private static final String[] SUBJECTS = {
        "Java", "DBMS", "Operating Systems", "DAA", "Microcontroller"
    };

    private static final double PASS_MARKS = 35;
    private static final double MAX_MARKS = 100;

    public static String getSubjectResult(double marks) {
        return marks >= PASS_MARKS ? "PASS" : "FAIL";
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

    private static double readMarks(Scanner scanner, String subject) {
        while (true) {
            System.out.print("Enter " + subject + " marks (0-100): ");
            String input = scanner.nextLine().trim();

            try {
                double marks = Double.parseDouble(input);

                if (Double.isFinite(marks)
                        && marks >= 0 && marks <= MAX_MARKS) {
                    return marks;
                }
            } catch (NumberFormatException e) {
                // Ask again if the input is invalid.
            }

            System.out.println(
                    "Invalid input. Please enter a number between 0 and 100.");
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

        if (studentName.isEmpty() || usn.isEmpty()) {
            System.out.println(
                    "Invalid input: Student name and USN are required.");
            scanner.close();
            return;
        }

        double[] marks = new double[SUBJECTS.length];
        double totalMarks = 0;
        int failedSubjects = 0;

        for (int i = 0; i < SUBJECTS.length; i++) {
            marks[i] = readMarks(scanner, SUBJECTS[i]);
            totalMarks += marks[i];

            if (marks[i] < PASS_MARKS) {
                failedSubjects++;
            }
        }

        double averageMarks = totalMarks / SUBJECTS.length;
        boolean passedAllSubjects = failedSubjects == 0;
        String grade = getGrade(averageMarks, passedAllSubjects);

        System.out.println("\n-------------- RESULT REPORT --------------");
        System.out.println("Student Name      : " + studentName);
        System.out.println("USN               : " + usn);
        System.out.println("-------------------------------------------");

        for (int i = 0; i < SUBJECTS.length; i++) {
            System.out.printf("%-19s: %6.2f  %s%n",
                    SUBJECTS[i], marks[i], getSubjectResult(marks[i]));
        }

        System.out.println("-------------------------------------------");
        System.out.printf("Total Marks       : %.2f / %.0f%n",
                totalMarks, MAX_MARKS * SUBJECTS.length);
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