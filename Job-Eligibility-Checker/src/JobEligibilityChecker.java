import java.util.Scanner;

public class JobEligibilityChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        sc.nextLine();

        if (age < 0) {
            System.out.println("Invalid age.");
            sc.close();
            return;
        }

        System.out.print("Do you have the required qualification? (yes/no): ");
        String qualification = sc.nextLine();

        if (age >= 18 && qualification.equalsIgnoreCase("yes")) {
            System.out.println("\nName: " + name);
            System.out.println("Status: Eligible for Job");
        } else {
            System.out.println("\nName: " + name);
            System.out.println("Status: Not Eligible for Job");
        }

        sc.close();
    }
}
