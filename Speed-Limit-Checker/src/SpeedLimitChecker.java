import java.util.Scanner;

public class SpeedLimitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("          SPEED LIMIT CHECKER");
        System.out.println("==========================================");
        System.out.println("Road Categories:");
        System.out.println("1. School Zone  - 30 km/h");
        System.out.println("2. City Road    - 50 km/h");
        System.out.println("3. Highway      - 100 km/h");

        System.out.print("\nEnter driver name: ");
        String driverName = scanner.nextLine().trim();

        System.out.print("Enter vehicle number: ");
        String vehicleNumber = scanner.nextLine().trim().toUpperCase();

        System.out.print("Select road category (1-3): ");
        int roadChoice = scanner.nextInt();

        System.out.print("Enter vehicle speed in km/h: ");
        double vehicleSpeed = scanner.nextDouble();

        if (driverName.isEmpty() || vehicleNumber.isEmpty()) {
            System.out.println("\nInvalid input: Driver and vehicle details are required.");
            scanner.close();
            return;
        }

        if (vehicleSpeed < 0) {
            System.out.println("\nInvalid input: Vehicle speed cannot be negative.");
            scanner.close();
            return;
        }

        String roadType;
        double speedLimit;

        switch (roadChoice) {
            case 1:
                roadType = "School Zone";
                speedLimit = 30.00;
                break;

            case 2:
                roadType = "City Road";
                speedLimit = 50.00;
                break;

            case 3:
                roadType = "Highway";
                speedLimit = 100.00;
                break;

            default:
                System.out.println("\nInvalid input: Select a road category from 1 to 3.");
                scanner.close();
                return;
        }

        double exceededSpeed = Math.max(vehicleSpeed - speedLimit, 0);
        double fineAmount;
        String violationLevel;
        String safetyMessage;

        if (exceededSpeed == 0) {
            fineAmount = 0;
            violationLevel = "NO VIOLATION";
            safetyMessage = "Thank you for following the speed limit.";
        } else if (exceededSpeed <= 10) {
            fineAmount = 500;
            violationLevel = "MINOR VIOLATION";
            safetyMessage = "Reduce speed and drive carefully.";
        } else if (exceededSpeed <= 20) {
            fineAmount = 1000;
            violationLevel = "MODERATE VIOLATION";
            safetyMessage = "Overspeeding increases accident risk.";
        } else if (exceededSpeed <= 40) {
            fineAmount = 2000;
            violationLevel = "MAJOR VIOLATION";
            safetyMessage = "Slow down immediately and follow road rules.";
        } else {
            fineAmount = 5000;
            violationLevel = "SEVERE VIOLATION";
            safetyMessage = "Dangerous driving detected. Immediate action required.";
        }

        System.out.println("\n------------- SPEED REPORT -------------");
        System.out.println("Driver Name     : " + driverName);
        System.out.println("Vehicle Number  : " + vehicleNumber);
        System.out.println("Road Type       : " + roadType);
        System.out.printf("Vehicle Speed   : %.2f km/h%n", vehicleSpeed);
        System.out.printf("Permitted Limit : %.2f km/h%n", speedLimit);
        System.out.printf("Exceeded Speed  : %.2f km/h%n", exceededSpeed);
        System.out.println("Violation Level : " + violationLevel);
        System.out.printf("Fine Amount     : Rs. %.2f%n", fineAmount);
        System.out.println("----------------------------------------");
        System.out.println("Safety Message  : " + safetyMessage);
        System.out.println("========================================");

        scanner.close();
    }
}