import java.util.Scanner;

public class ParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double hourlyRate = 20.00;

        System.out.println("================================");
        System.out.println("      PARKING FEE CALCULATOR");
        System.out.println("================================");

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter vehicle number: ");
        String vehicleNumber = scanner.nextLine();

        System.out.print("Enter parking hours: ");
        int parkingHours = scanner.nextInt();

        double parkingFee = parkingHours * hourlyRate;

        System.out.println("\n--------- PARKING RECEIPT ---------");
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Parking Hours  : " + parkingHours);
        System.out.printf("Hourly Rate    : Rs. %.2f%n", hourlyRate);
        System.out.printf("Total Fee      : Rs. %.2f%n", parkingFee);
        System.out.println("-----------------------------------");

        scanner.close();
    }
}