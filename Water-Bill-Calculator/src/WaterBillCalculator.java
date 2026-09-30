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

        double bill;

        if (usage <= 1000) {
            bill = usage * 0.02;
        } else if (usage <= 5000) {
            bill = 1000 * 0.02 + (usage - 1000) * 0.03;
        } else {
            bill = 1000 * 0.02 + 4000 * 0.03
                    + (usage - 5000) * 0.05;
        }

        System.out.println("Water Usage: " + usage + " liters");
        System.out.println("Water Bill: Rs. " + bill);

        sc.close();
    }
}