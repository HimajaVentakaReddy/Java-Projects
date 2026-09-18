import java.util.Scanner;

public class SpeedLimitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("        SPEED LIMIT CHECKER");
        System.out.println("======================================");
        System.out.println("Road Categories:");
        System.out.println("1. School Zone");
        System.out.println("2. City Road");
        System.out.println("3. Highway");

        System.out.print("\nEnter driver name: ");
        String driverName = scanner.nextLine();

        System.out.print("Enter vehicle number: ");
        String vehicleNumber = scanner.nextLine();

        System.out.print("Select road category (1-3): ");
        int roadChoice = scanner.nextInt();

        System.out.print("Enter vehicle speed in km/h: ");
        double vehicleSpeed = scanner.nextDouble();

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
                System.out.println("\nInvalid road category.");
                scanner.close();
                return;
        }

        double speedDifference = vehicleSpeed - speedLimit;

        System.out.println("\n------------ SPEED REPORT ------------");
        System.out.println("Driver Name    : " + driverName);
        System.out.println("Vehicle Number : " + vehicleNumber.toUpperCase());
        System.out.println("Road Type      : " + roadType);
        System.out.printf("Vehicle Speed  : %.2f km/h%n", vehicleSpeed);
        System.out.printf("Speed Limit    : %.2f km/h%n", speedLimit);

        if (speedDifference <= 0) {
            System.out.println("Status         : WITHIN SPEED LIMIT");
            System.out.printf("Available Limit: %.2f km/h%n",
                    Math.abs(speedDifference));
        } else {
            System.out.println("Status         : OVERSPEEDING");
            System.out.printf("Limit Exceeded : %.2f km/h%n",
                    speedDifference);
        }

        System.out.println("--------------------------------------");

        scanner.close();
    }
}