import java.util.Scanner;

public class BusSeatAvailabilityManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] seats = new boolean[5][4];

        int choice;

        System.out.println("===== BUS SEAT AVAILABILITY MANAGER =====");

        do {
            System.out.println("\n1. View Seats");
            System.out.println("2. Book Seat");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("\n===== SEAT STATUS =====");

                for (int i = 0; i < seats.length; i++) {
                    for (int j = 0; j < seats[i].length; j++) {
                        if (seats[i][j]) {
                            System.out.print("[Booked] ");
                        } else {
                            System.out.print("[Empty] ");
                        }
                    }
                    System.out.println();
                }

            } else if (choice == 2) {
                System.out.print("Enter row number (1-5): ");
                int row = sc.nextInt();

                System.out.print("Enter seat number (1-4): ");
                int seat = sc.nextInt();

                if (row < 1 || row > 5 || seat < 1 || seat > 4) {
                    System.out.println("Invalid seat selection!");
                } else if (seats[row - 1][seat - 1]) {
                    System.out.println("Seat already booked!");
                } else {
                    seats[row - 1][seat - 1] = true;
                    System.out.println("Seat booked successfully!");
                }

            } else if (choice == 3) {
                System.out.println("Thank you for using the system!");

            } else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
