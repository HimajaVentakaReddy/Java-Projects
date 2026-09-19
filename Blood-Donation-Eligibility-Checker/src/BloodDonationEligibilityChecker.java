import java.util.Scanner;

public class BloodDonationEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   BLOOD DONATION ELIGIBILITY CHECKER");
        System.out.println("========================================");

        System.out.print("Enter donor name: ");
        String donorName = scanner.nextLine();

        System.out.print("Enter donor age: ");
        int age = scanner.nextInt();

        System.out.print("Enter donor weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter haemoglobin level in g/dL: ");
        double haemoglobin = scanner.nextDouble();

        boolean validAge = age >= 18 && age <= 65;
        boolean validWeight = weight >= 50;
        boolean validHaemoglobin = haemoglobin >= 12.5;

        System.out.println("\n---------- ELIGIBILITY REPORT ----------");
        System.out.println("Donor Name       : " + donorName);
        System.out.println("Age              : " + age + " years");
        System.out.printf("Weight           : %.2f kg%n", weight);
        System.out.printf("Haemoglobin      : %.2f g/dL%n", haemoglobin);
        System.out.println("----------------------------------------");
        System.out.println("Age Requirement  : "
                + (validAge ? "PASS" : "FAIL"));
        System.out.println("Weight Requirement: "
                + (validWeight ? "PASS" : "FAIL"));
        System.out.println("Haemoglobin Check: "
                + (validHaemoglobin ? "PASS" : "FAIL"));
        System.out.println("----------------------------------------");

        if (validAge && validWeight && validHaemoglobin) {
            System.out.println("Final Status     : ELIGIBLE");
            System.out.println("Message          : Basic requirements satisfied.");
        } else {
            System.out.println("Final Status     : NOT ELIGIBLE");
            System.out.println("Reasons:");

            if (!validAge) {
                System.out.println("- Age must be between 18 and 65 years.");
            }

            if (!validWeight) {
                System.out.printf("- Gain at least %.2f kg to meet the requirement.%n",
                        50 - weight);
            }

            if (!validHaemoglobin) {
                System.out.printf("- Haemoglobin is %.2f g/dL below the requirement.%n",
                        12.5 - haemoglobin);
            }
        }

        System.out.println("========================================");

        scanner.close();
    }
}