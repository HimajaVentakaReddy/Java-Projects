import java.util.Scanner;

public class MobileDataUsageAlert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     MOBILE DATA USAGE ALERT");
        System.out.println("================================");

        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter total data limit in GB: ");
        double dataLimit = scanner.nextDouble();

        System.out.print("Enter data used in GB: ");
        double dataUsed = scanner.nextDouble();

        double remainingData = dataLimit - dataUsed;
        double usagePercentage = (dataUsed / dataLimit) * 100;

        System.out.println("\n---------- DATA SUMMARY ----------");
        System.out.println("User Name        : " + userName);
        System.out.printf("Total Data Limit : %.2f GB%n", dataLimit);
        System.out.printf("Data Used        : %.2f GB%n", dataUsed);
        System.out.printf("Remaining Data   : %.2f GB%n", remainingData);
        System.out.printf("Usage Percentage : %.2f%%%n", usagePercentage);
        System.out.println("----------------------------------");

        scanner.close();
    }
}
