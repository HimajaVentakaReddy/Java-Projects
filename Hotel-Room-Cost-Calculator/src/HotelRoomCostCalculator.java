import java.util.Scanner;

public class HotelRoomCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Hotel Room Cost Calculator ===");
        System.out.println("1. Standard Room - Rs. 1500/night");
        System.out.println("2. Deluxe Room   - Rs. 2500/night");
        System.out.println("3. Suite         - Rs. 4000/night");

        System.out.print("Choose room type (1-3): ");
        int choice = sc.nextInt();

        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();

        double rate;

        if (choice == 1) {
            rate = 1500;
        } else if (choice == 2) {
            rate = 2500;
        } else if (choice == 3) {
            rate = 4000;
        } else {
            rate = 0;
        }

        if (rate == 0 || nights <= 0) {
            System.out.println("Invalid room type or number of nights.");
        } else {
            double total = rate * nights;
            System.out.printf("Room rate per night: Rs. %.2f%n", rate);
            System.out.printf("Total hotel cost: Rs. %.2f%n", total);
        }

        sc.close();
    }
}