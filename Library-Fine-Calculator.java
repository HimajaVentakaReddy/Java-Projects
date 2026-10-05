import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of late days: ");
        int days = sc.nextInt();

        if (days < 0) {
            System.out.println("Invalid number of days.");
        } else {
            double fine;

            if (days <= 5) {
                fine = days * 2;
            } else if (days <= 10) {
                fine = days * 3;
            } else {
                fine = days * 5;
            }

            System.out.println("Library Fine: Rs. " + fine);
        }

        sc.close();
    }
}
