import java.util.Scanner;

public class GroceryStockExpiryTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== GROCERY STOCK EXPIRY TRACKER =====");

        System.out.print("Enter number of grocery items: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Invalid number of items!");
            sc.close();
            return;
        }

        String[] names = new String[n];
        int[] days = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter item name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter days until expiry (negative if expired): ");
            days[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\n===== EXPIRY REPORT =====");

        for (int i = 0; i < n; i++) {
            System.out.println("\nItem: " + names[i]);

            if (days[i] < 0) {
                System.out.println("Status: Expired");
            } else if (days[i] == 0) {
                System.out.println("Status: Expires Today");
            } else if (days[i] <= 7) {
                System.out.println("Status: Expiring Soon");
            } else {
                System.out.println("Status: Safe to Use");
            }
        }

        sc.close();
    }
}
