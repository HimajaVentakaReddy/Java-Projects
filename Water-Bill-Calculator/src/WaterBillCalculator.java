import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water usage in liters: ");
        double usage = sc.nextDouble();

        if (usage < 0) {
            System.out.println("Invalid water usage.");
            sc.close();
            return;
        }

        double bill = usage * 0.02;

        System.out.println("Water Usage: " + usage + " liters");
        System.out.println("Water Bill: Rs. " + bill);

        sc.close();
    }
}