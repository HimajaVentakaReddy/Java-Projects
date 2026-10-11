import java.util.Scanner;

public class FuelCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Fuel Cost Calculator ===");

        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();

        System.out.print("Enter mileage in km/l: ");
        double mileage = sc.nextDouble();

        System.out.print("Enter fuel price per litre: Rs. ");
        double price = sc.nextDouble();

        if (distance <= 0 || mileage <= 0 || price <= 0) {
            System.out.println("Invalid input! Enter values greater than zero.");
        } else {
            double litres = distance / mileage;
            double cost = litres * price;

            System.out.printf("Fuel required: %.2f litres%n", litres);
            System.out.printf("Total fuel cost: Rs. %.2f%n", cost);
        }

        sc.close();
    }
}