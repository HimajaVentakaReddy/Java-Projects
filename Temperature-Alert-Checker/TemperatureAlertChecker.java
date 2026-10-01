import java.util.Scanner;

public class TemperatureAlertChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double temperature = sc.nextDouble();

        System.out.println("Temperature: " + temperature + "°C");

        if (temperature > 40) {
            System.out.println("Alert: Very High Temperature!");
        }

        sc.close();
    }
}