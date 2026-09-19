import java.util.Scanner;

public class BloodDonationEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("    BLOOD DONATION ELIGIBILITY CHECKER");
        System.out.println("==========================================");
        System.out.println("Educational pre-screening only.");
        System.out.println("Final eligibility requires medical screening.");

        System.out.print("\nEnter donor name: ");
        String donorName = scanner.nextLine().trim();

        System.out.print("Enter donor age: ");
        int age = scanner.nextInt();

        System.out.print("Enter donor weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter haemoglobin level in g/dL: ");
        double haemoglobin = scanner.nextDouble();

        System.out.print("Are you feeling healthy today? (yes/no): ");
        String healthy = scanner.next().trim();

        System.out.print("Have you had a recent illness? (yes/no): ");
        String recentIllness = scanner.next().trim();

        System.out.print(
                "Enter days since last donation (-1 for first-time donor): ");
        int daysSinceDonation = scanner.nextInt();

        boolean validTextAnswers =
                (healthy.equalsIgnoreCase("yes")
                        || healthy.equalsIgnoreCase("no"))
                && (recentIllness.equalsIgnoreCase("yes")
                        || recentIllness.equalsIgnoreCase("no"));

        if (donorName.isEmpty()
                || age < 0
                || weight <= 0
                || haemoglobin <= 0
                || !validTextAnswers
                || daysSinceDonation < -1) {
            System.out.println("\nInvalid input detected.");
            System.out.println("Please enter valid donor details and yes/no answers.");
            scanner.close();
            return;
        }

        boolean validAge = age >= 18 && age <= 65;
        boolean validWeight = weight >= 50;
        boolean validHaemoglobin = haemoglobin >= 12.5;
        boolean validHealth = healthy.equalsIgnoreCase("yes");
        boolean noRecentIllness = recentIllness.equalsIgnoreCase("no");
        boolean validDonationGap =
                daysSinceDonation == -1 || daysSinceDonation >= 90;

        int failedChecks = 0;

        if (!validAge) {
            failedChecks++;
        }
        if (!validWeight) {
            failedChecks++;
        }
        if (!validHaemoglobin) {
            failedChecks++;
        }
        if (!validHealth) {
            failedChecks++;
        }
        if (!noRecentIllness) {
            failedChecks++;
        }
        if (!validDonationGap) {
            failedChecks++;
        }

        boolean eligible = failedChecks == 0;

        System.out.println("\n------------- DONOR REPORT -------------");
        System.out.println("Donor Name        : " + donorName);
        System.out.println("Age               : " + age + " years");
        System.out.printf("Weight            : %.2f kg%n", weight);
        System.out.printf("Haemoglobin       : %.2f g/dL%n", haemoglobin);
        System.out.println("Healthy Today     : " + healthy.toUpperCase());
        System.out.println("Recent Illness    : "
                + recentIllness.toUpperCase());

        if (daysSinceDonation == -1) {
            System.out.println("Donation History  : First-time donor");
        } else {
            System.out.println("Donation Gap      : "
                    + daysSinceDonation + " days");
        }

        System.out.println("----------------------------------------");
        System.out.println("Age Check         : "
                + (validAge ? "PASS" : "FAIL"));
        System.out.println("Weight Check      : "
                + (validWeight ? "PASS" : "FAIL"));
        System.out.println("Haemoglobin Check : "
                + (validHaemoglobin ? "PASS" : "FAIL"));
        System.out.println("Health Check      : "
                + (validHealth ? "PASS" : "FAIL"));
        System.out.println("Illness Check     : "
                + (noRecentIllness ? "PASS" : "FAIL"));
        System.out.println("Donation Gap Check: "
                + (validDonationGap ? "PASS" : "FAIL"));
        System.out.println("----------------------------------------");

        if (eligible) {
            System.out.println("Preliminary Status: ELIGIBLE");
            System.out.println(
                    "Next Step         : Complete medical screening.");
        } else {
            System.out.println("Preliminary Status: NOT ELIGIBLE");
            System.out.println("Failed Checks     : " + failedChecks);
            System.out.println("Reasons:");

            if (!validAge) {
                System.out.println(
                        "- Age must be between 18 and 65 years.");
            }

            if (!validWeight) {
                System.out.println(
                        "- Minimum weight requirement is 50 kg.");
            }

            if (!validHaemoglobin) {
                System.out.println(
                        "- Haemoglobin must be at least 12.5 g/dL.");
            }

            if (!validHealth) {
                System.out.println(
                        "- Donor should feel healthy on donation day.");
            }

            if (!noRecentIllness) {
                System.out.println(
                        "- Recent illness requires professional review.");
            }

            if (!validDonationGap) {
                int remainingDays = 90 - daysSinceDonation;
                System.out.println("- Wait at least "
                        + remainingDays + " more day(s).");
            }
        }

        System.out.println("----------------------------------------");
        System.out.println(
                "Note: A healthcare professional makes the final decision.");
        System.out.println("========================================");

        scanner.close();
    }
}