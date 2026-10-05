import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of late days: ");
        int days = sc.nextInt();

        double fine = days * 2;

        System.out.println("Library Fine: Rs. " + fine);

        sc.close();
    }
}
