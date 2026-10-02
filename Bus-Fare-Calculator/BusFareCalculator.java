import java.util.Scanner;

public class BusFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();

        System.out.print("Enter fare per km: ");
        double farePerKm = sc.nextDouble();

        double totalFare = distance * farePerKm;

        System.out.println("Total Bus Fare: Rs. " + totalFare);

        sc.close();
    }
}
