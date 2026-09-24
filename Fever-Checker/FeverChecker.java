import java.util.Scanner;

public class FeverChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your temperature in Celsius: ");
        double temperature = sc.nextDouble();

        if (temperature < 0) {
            System.out.println("Invalid temperature!");
            sc.close();
            return;
        }

        System.out.println("\n--- Temperature Report ---");
        System.out.println("Name: " + name);
        System.out.println("Temperature: " + temperature + " C");

        if (temperature < 37) {
            System.out.println("Status: Normal");
        } else if (temperature < 38) {
            System.out.println("Status: Mild Temperature");
        } else {
            System.out.println("Status: Fever");
        }

        sc.close();
    }
}