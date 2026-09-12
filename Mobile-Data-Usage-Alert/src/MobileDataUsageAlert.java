import java.util.Scanner;

public class MobileDataUsageAlert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("       MOBILE DATA USAGE ALERT");
        System.out.println("======================================");

        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter total data limit in GB: ");
        double dataLimit = scanner.nextDouble();

        System.out.print("Enter data used in GB: ");
        double dataUsed = scanner.nextDouble();

        if (dataLimit <= 0 || dataUsed < 0) {
            System.out.println("\nInvalid input!");
            System.out.println("Data limit must be greater than zero.");
            System.out.println("Data used cannot be negative.");
            scanner.close();
            return;
        }

        double usagePercentage = (dataUsed / dataLimit) * 100;
        double remainingData = Math.max(dataLimit - dataUsed, 0);
        double exceededData = Math.max(dataUsed - dataLimit, 0);

        String usageStatus;
        String alertMessage;

        if (usagePercentage >= 100) {
            usageStatus = "LIMIT EXCEEDED";
            alertMessage = "Your data limit has been exhausted. Avoid additional usage.";
        } else if (usagePercentage >= 90) {
            usageStatus = "CRITICAL USAGE";
            alertMessage = "More than 90% of your data is used. Use data carefully.";
        } else if (usagePercentage >= 75) {
            usageStatus = "HIGH USAGE";
            alertMessage = "You have used at least 75% of your data limit.";
        } else if (usagePercentage >= 50) {
            usageStatus = "MODERATE USAGE";
            alertMessage = "Your data usage is moderate. Continue monitoring it.";
        } else {
            usageStatus = "SAFE USAGE";
            alertMessage = "Your data usage is within a safe limit.";
        }

        System.out.println("\n------------ DATA SUMMARY ------------");
        System.out.println("User Name        : " + userName);
        System.out.printf("Total Data Limit : %.2f GB%n", dataLimit);
        System.out.printf("Data Used        : %.2f GB%n", dataUsed);
        System.out.printf("Remaining Data   : %.2f GB%n", remainingData);
        System.out.printf("Usage Percentage : %.2f%%%n", usagePercentage);
        System.out.println("Usage Status     : " + usageStatus);

        if (exceededData > 0) {
            System.out.printf("Limit Exceeded By: %.2f GB%n", exceededData);
        }

        System.out.println("--------------------------------------");
        System.out.println("Alert: " + alertMessage);
        System.out.println("======================================");

        scanner.close();
    }
}