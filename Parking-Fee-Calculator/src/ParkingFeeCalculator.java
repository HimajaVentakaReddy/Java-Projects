import java.util.Scanner;

public class ParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("        PARKING FEE CALCULATOR");
        System.out.println("======================================");
        System.out.println("Vehicle Categories:");
        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Heavy Vehicle");

        System.out.print("\nEnter customer name: ");
        String customerName = scanner.nextLine().trim();

        System.out.print("Enter vehicle number: ");
        String vehicleNumber = scanner.nextLine().trim().toUpperCase();

        int category;
        while (true) {
            System.out.print("Select vehicle category (1-3): ");
            String input = scanner.nextLine().trim();

            try {
                category = Integer.parseInt(input);
                if (category >= 1 && category <= 3) {
                    break;
                }
            } catch (NumberFormatException e) {
                // Ask again when the input is not a whole number.
            }

            System.out.println("Invalid category. Enter 1, 2, or 3.");
        }

        int parkingHours;
        while (true) {
            System.out.print("Enter parking hours (positive whole number): ");
            String input = scanner.nextLine().trim();

            try {
                parkingHours = Integer.parseInt(input);
                if (parkingHours > 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                // Ask again when the input is not a whole number.
            }

            System.out.println("Invalid hours. Enter a positive whole number.");
        }

        if (customerName.isEmpty() || vehicleNumber.isEmpty()) {
            System.out.println("\nInvalid input: Customer name and vehicle number are required.");
            scanner.close();
            return;
        }

        if (parkingHours <= 0) {
            System.out.println("\nInvalid input: Parking hours must be greater than zero.");
            scanner.close();
            return;
        }

        String vehicleType;
        double baseCharge;
        double additionalHourlyRate;

        switch (category) {
            case 1:
                vehicleType = "Bike";
                baseCharge = 20.00;
                additionalHourlyRate = 10.00;
                break;

            case 2:
                vehicleType = "Car";
                baseCharge = 40.00;
                additionalHourlyRate = 20.00;
                break;

            case 3:
                vehicleType = "Heavy Vehicle";
                baseCharge = 60.00;
                additionalHourlyRate = 30.00;
                break;

            default:
                System.out.println("\nInvalid input: Select a category between 1 and 3.");
                scanner.close();
                return;
        }

        int additionalHours = Math.max(parkingHours - 2, 0);
        double additionalCharge = additionalHours * additionalHourlyRate;
        double totalFee = baseCharge + additionalCharge;

        System.out.println("\n------------ PARKING RECEIPT ------------");
        System.out.println("Customer Name    : " + customerName);
        System.out.println("Vehicle Number   : " + vehicleNumber);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Parking Hours    : " + parkingHours);
        System.out.printf("Base Charge      : Rs. %.2f%n", baseCharge);
        System.out.println("Additional Hours : " + additionalHours);
        System.out.printf("Additional Rate  : Rs. %.2f per hour%n",
                additionalHourlyRate);
        System.out.printf("Additional Charge: Rs. %.2f%n", additionalCharge);
        System.out.println("-----------------------------------------");
        System.out.printf("Total Parking Fee: Rs. %.2f%n", totalFee);
        System.out.println("=========================================");

        scanner.close();
    }
}