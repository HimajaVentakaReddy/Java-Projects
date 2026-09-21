import java.util.Scanner;

public class ScholarshipEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("     SCHOLARSHIP ELIGIBILITY CHECKER");
        System.out.println("==========================================");
        System.out.println("Scholarship Types:");
        System.out.println("1. Merit Scholarship");
        System.out.println("2. Need-Based Scholarship");
        System.out.println("3. Sports Scholarship");

        System.out.print("\nEnter student name: ");
        String studentName = scanner.nextLine().trim();

        System.out.print("Enter USN: ");
        String usn = scanner.nextLine().trim().toUpperCase();

        System.out.print("Enter academic percentage: ");
        double percentage = scanner.nextDouble();

        System.out.print("Enter attendance percentage: ");
        double attendance = scanner.nextDouble();

        System.out.print("Enter annual family income: Rs. ");
        double familyIncome = scanner.nextDouble();

        System.out.print("Select scholarship type (1-3): ");
        int scholarshipChoice = scanner.nextInt();

        scanner.nextLine();

        String sportsCertificate = "not required";

        if (scholarshipChoice == 3) {
            System.out.print(
                    "Do you have a recognized sports certificate? (yes/no): ");
            sportsCertificate = scanner.nextLine().trim();
        }

        boolean validSportsAnswer =
                scholarshipChoice != 3
                || sportsCertificate.equalsIgnoreCase("yes")
                || sportsCertificate.equalsIgnoreCase("no");

        if (studentName.isEmpty()
                || usn.isEmpty()
                || percentage < 0
                || percentage > 100
                || attendance < 0
                || attendance > 100
                || familyIncome < 0
                || scholarshipChoice < 1
                || scholarshipChoice > 3
                || !validSportsAnswer) {
            System.out.println("\nInvalid input detected.");
            System.out.println(
                    "Enter valid details, percentages, and choices.");
            scanner.close();
            return;
        }

        String scholarshipType;
        boolean academicCheck;
        boolean attendanceCheck;
        boolean incomeCheck = true;
        boolean sportsCheck = true;
        double scholarshipAmount;

        switch (scholarshipChoice) {
            case 1:
                scholarshipType = "Merit Scholarship";
                academicCheck = percentage >= 90;
                attendanceCheck = attendance >= 75;
                scholarshipAmount = 50000;
                break;

            case 2:
                scholarshipType = "Need-Based Scholarship";
                academicCheck = percentage >= 75;
                attendanceCheck = attendance >= 75;
                incomeCheck = familyIncome <= 250000;
                scholarshipAmount = 30000;
                break;

            default:
                scholarshipType = "Sports Scholarship";
                academicCheck = percentage >= 60;
                attendanceCheck = attendance >= 65;
                sportsCheck = sportsCertificate.equalsIgnoreCase("yes");
                scholarshipAmount = 25000;
                break;
        }

        boolean eligible = academicCheck
                && attendanceCheck
                && incomeCheck
                && sportsCheck;

        int failedChecks = 0;

        if (!academicCheck) {
            failedChecks++;
        }
        if (!attendanceCheck) {
            failedChecks++;
        }
        if (!incomeCheck) {
            failedChecks++;
        }
        if (!sportsCheck) {
            failedChecks++;
        }

        System.out.println("\n----------- SCHOLARSHIP REPORT -----------");
        System.out.println("Student Name       : " + studentName);
        System.out.println("USN                : " + usn);
        System.out.println("Scholarship Type   : " + scholarshipType);
        System.out.printf("Academic Percentage: %.2f%%%n", percentage);
        System.out.printf("Attendance         : %.2f%%%n", attendance);
        System.out.printf("Annual Income      : Rs. %.2f%n", familyIncome);

        if (scholarshipChoice == 3) {
            System.out.println("Sports Certificate : "
                    + sportsCertificate.toUpperCase());
        }

        System.out.println("------------------------------------------");
        System.out.println("Academic Check     : "
                + (academicCheck ? "PASS" : "FAIL"));
        System.out.println("Attendance Check   : "
                + (attendanceCheck ? "PASS" : "FAIL"));

        if (scholarshipChoice == 2) {
            System.out.println("Income Check       : "
                    + (incomeCheck ? "PASS" : "FAIL"));
        }

        if (scholarshipChoice == 3) {
            System.out.println("Sports Check       : "
                    + (sportsCheck ? "PASS" : "FAIL"));
        }

        System.out.println("------------------------------------------");

        if (eligible) {
            System.out.println("Selection Status   : ELIGIBLE");
            System.out.printf("Scholarship Amount : Rs. %.2f%n",
                    scholarshipAmount);
            System.out.println(
                    "Next Step           : Submit documents for verification.");
        } else {
            System.out.println("Selection Status   : NOT ELIGIBLE");
            System.out.println("Failed Checks      : " + failedChecks);
            System.out.println("Reasons:");

            if (!academicCheck) {
                System.out.println(
                        "- Academic requirement was not satisfied.");
            }

            if (!attendanceCheck) {
                System.out.println(
                        "- Attendance requirement was not satisfied.");
            }

            if (!incomeCheck) {
                System.out.println(
                        "- Family income exceeds the permitted limit.");
            }

            if (!sportsCheck) {
                System.out.println(
                        "- A recognized sports certificate is required.");
            }
        }

        System.out.println("------------------------------------------");
        System.out.println(
                "Note: Rules and amounts are for demonstration only.");
        System.out.println("==========================================");

        scanner.close();
    }
}