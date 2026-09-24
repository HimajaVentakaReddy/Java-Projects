import java.util.Scanner;

public class FeverChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your temperature in Celsius: ");
        double temperature = sc.nextDouble();

        if (temperature >= 38) {
            System.out.println("You have a fever.");
        } else {
            System.out.println("You do not have a fever.");
        }

        System.out.println("Name: " + name);
        System.out.println("Temperature: " + temperature + " C");

        sc.close();
    }
}