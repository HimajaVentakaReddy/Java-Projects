import java.util.Scanner;

public class ScholarshipEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double minimumPercentage = 75.00;
        final double minimumAttendance = 75.00;
        final double maximumFamilyIncome = 250000.00;

        System.out.println("========================================");
        System.out.println("    SCHOLARSHIP ELIGIBILITY CHECKER");
        System.out.println("========================================");

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter USN: ");
        String usn = scanner.nextLine();

        System.out.print("Enter academic percentage: ");
        double percentage = scanner.nextDouble();

        System.out.print("Enter attendance percentage: ");
        double attendance = scanner.nextDouble();

        System.out.print("Enter annual family income: Rs. ");
        double familyIncome = scanner.nextDouble();

        boolean validPercentage = percentage >= minimumPercentage;
        boolean validAttendance = attendance >= minimumAttendance;
        boolean validIncome = familyIncome <= maximumFamilyIncome;

        System.out.println("\n---------- ELIGIBILITY REPORT ----------");
        System.out.println("Student Name     : " + studentName);
        System.out.println("USN              : " + usn.toUpperCase());
        System.out.printf("Academic Score   : %.2f%%%n", percentage);
        System.out.printf("Attendance       : %.2f%%%n", attendance);
        System.out.printf("Family Income    : Rs. %.2f%n", familyIncome);
        System.out.println("----------------------------------------");
        System.out.println("Academic Check   : "
                + (validPercentage ? "PASS" : "FAIL"));
        System.out.println("Attendance Check : "
                + (validAttendance ? "PASS" : "FAIL"));
        System.out.println("Income Check     : "
                + (validIncome ? "PASS" : "FAIL"));
        System.out.println("----------------------------------------");

        if (validPercentage && validAttendance && validIncome) {
            System.out.println("Final Status     : ELIGIBLE");
            System.out.println("Message          : All requirements satisfied.");
        } else {
            System.out.println("Final Status     : NOT ELIGIBLE");
            System.out.println("Reasons:");

            if (!validPercentage) {
                System.out.printf(
                        "- Academic percentage must improve by %.2f%%.%n",
                        minimumPercentage - percentage);
            }

            if (!validAttendance) {
                System.out.printf(
                        "- Attendance must improve by %.2f%%.%n",
                        minimumAttendance - attendance);
            }

            if (!validIncome) {
                System.out.println(
                        "- Family income exceeds the permitted limit.");
            }
        }

        System.out.println("========================================");

        scanner.close();
    }
}