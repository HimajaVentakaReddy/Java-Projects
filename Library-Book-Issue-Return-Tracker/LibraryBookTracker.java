import java.util.Scanner;

public class LibraryBookTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== LIBRARY BOOK TRACKER =====");

        System.out.print("Enter total library books: ");
        int total = sc.nextInt();

        System.out.print("Enter currently issued books: ");
        int issued = sc.nextInt();

        System.out.print("Enter number of books returned: ");
        int returned = sc.nextInt();

        if (total <= 0 || issued < 0 || issued > total
                || returned < 0 || returned > issued) {
            System.out.println("Invalid book details!");
        } else {
            int currentIssued = issued - returned;
            int available = total - currentIssued;

            System.out.println("\n===== LIBRARY REPORT =====");
            System.out.println("Total Books: " + total);
            System.out.println("Currently Issued: " + currentIssued);
            System.out.println("Available Books: " + available);

            if (available == 0) {
                System.out.println("Status: No books available");
            } else {
                System.out.println("Status: Books available for issue");
            }
        }

        sc.close();
    }
}
