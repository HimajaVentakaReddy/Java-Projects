import java.util.Scanner;

public class WaterTankMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== WATER TANK LEVEL MONITOR =====");

        System.out.print("Enter tank capacity in litres: ");
        double capacity = sc.nextDouble();

        System.out.print("Enter current water level in litres: ");
        double current = sc.nextDouble();

        System.out.print("Enter water used in litres: ");
        double used = sc.nextDouble();

        if (capacity <= 0 || current < 0 || current > capacity
                || used < 0 || used > current) {
            System.out.println("Invalid water details!");
        } else {
            double remaining = current - used;
            double percentage = (remaining / capacity) * 100;

            System.out.println("\n===== WATER TANK REPORT =====");
            System.out.println("Tank Capacity: " + capacity + " litres");
            System.out.println("Water Used: " + used + " litres");
            System.out.println("Remaining Water: " + remaining + " litres");
            System.out.printf("Tank Level: %.2f%%%n", percentage);

            if (percentage <= 20) {
                System.out.println("Alert: Water level is LOW!");
            } else if (percentage >= 90) {
                System.out.println("Status: Tank is almost FULL");
            } else {
                System.out.println("Status: Water level is NORMAL");
            }
        }

        sc.close();
    }
}

