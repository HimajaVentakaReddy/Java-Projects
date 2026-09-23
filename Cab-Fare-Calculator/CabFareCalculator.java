
import java.util.Scanner;

public class CabFareCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();

        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();

        double fare = distance * 15;

        System.out.println("\n--- Cab Fare Receipt ---");
        System.out.println("Passenger: " + name);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs. " + fare);

        sc.close();
    }
}