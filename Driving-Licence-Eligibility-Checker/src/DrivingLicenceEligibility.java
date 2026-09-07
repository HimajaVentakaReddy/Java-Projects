import java.util.Scanner;

public class DrivingLicenceEligibility {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("  DRIVING LICENCE ELIGIBILITY CHECKER");
        System.out.println("======================================");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Invalid age entered.");
        } else if (age >= 18) {
            System.out.println("\nHello, " + name + "!");
            System.out.println("You are eligible to apply for a driving licence.");
        } else {
            int remainingYears = 18 - age;

            System.out.println("\nHello, " + name + "!");
            System.out.println("You are not eligible to apply for a driving licence.");
            System.out.println("You can apply after " + remainingYears + " year(s).");
        }

        scanner.close();
    }
}