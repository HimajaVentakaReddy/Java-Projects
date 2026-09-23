import java.util.Scanner;

public class CabFareCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();

        System.out.print("Enter cab type (Bike/Auto/Car): ");
        String cabType = sc.nextLine();

        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();

        if (distance <= 0) {
            System.out.println("Invalid distance!");
            sc.close();
            return;
        }

        System.out.print("Is it night ride? (yes/no): ");
        String night = sc.next();

        double rate = 15;

        if (cabType.equalsIgnoreCase("Bike")) {
            rate = 10;
        } else if (cabType.equalsIgnoreCase("Auto")) {
            rate = 12;
        } else if (!cabType.equalsIgnoreCase("Car")) {
            System.out.println("Invalid cab type!");
            sc.close();
            return;
        }

        double fare = distance * rate;

        if (night.equalsIgnoreCase("yes")) {
            fare = fare + 50;
        }

        System.out.println("\n--- Cab Fare Receipt ---");
        System.out.println("Passenger: " + name);
        System.out.println("Cab Type: " + cabType);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs. " + fare);

        sc.close();
    }
}