import java.util.Scanner;

public class MovieTicketAgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      MOVIE TICKET AGE CHECK");
        System.out.println("================================");

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Invalid age.");
            scanner.close();
            return;
        }

        double ticketPrice;

        if (age < 5) {
            System.out.println("Ticket Status: Free entry for young children.");
            ticketPrice = 0;
        } else if (age < 18) {
            System.out.println("Ticket Status: Child/Teen ticket required.");
            ticketPrice = 120;
        } else {
            System.out.println("Ticket Status: Adult ticket required.");
            ticketPrice = 200;
        }

        System.out.print("Enter number of tickets: ");
        int tickets = scanner.nextInt();

        if (tickets <= 0) {
            System.out.println("Invalid number of tickets.");
            scanner.close();
            return;
        }

        double totalCost = ticketPrice * tickets;

        System.out.println();
        System.out.println("--------- TICKET SUMMARY ---------");
        System.out.printf("Ticket Price : Rs. %.2f%n", ticketPrice);
        System.out.println("Tickets      : " + tickets);
        System.out.printf("Total Cost   : Rs. %.2f%n", totalCost);
        System.out.println("----------------------------------");
        System.out.println("================================");

        scanner.close();
    }
}
