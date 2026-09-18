import java.util.Scanner;

public class SpeedLimitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double speedLimit = 60.00;

        System.out.println("================================");
        System.out.println("      SPEED LIMIT CHECKER");
        System.out.println("================================");

        System.out.print("Enter driver name: ");
        String driverName = scanner.nextLine();

        System.out.print("Enter vehicle number: ");
        String vehicleNumber = scanner.nextLine();

        System.out.print("Enter vehicle speed in km/h: ");
        double vehicleSpeed = scanner.nextDouble();

        System.out.println("\n---------- SPEED REPORT ----------");
        System.out.println("Driver Name    : " + driverName);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.printf("Vehicle Speed  : %.2f km/h%n", vehicleSpeed);
        System.out.printf("Speed Limit    : %.2f km/h%n", speedLimit);

        if (vehicleSpeed <= speedLimit) {
            System.out.println("Status         : WITHIN SPEED LIMIT");
        } else {
            double exceededSpeed = vehicleSpeed - speedLimit;

            System.out.println("Status         : OVERSPEEDING");
            System.out.printf("Limit Exceeded : %.2f km/h%n", exceededSpeed);
        }

        System.out.println("----------------------------------");

        scanner.close();
    }
}