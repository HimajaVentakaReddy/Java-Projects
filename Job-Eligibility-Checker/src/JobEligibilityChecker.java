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

        System.out.println("\nSelect Job Type:");
        System.out.println("1. Software Job");
        System.out.println("2. Government Job");
        System.out.println("3. General Job");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Do you have the required qualification? (yes/no): ");
        String qualification = sc.nextLine();

        boolean eligible = age >= 18 &&
                           qualification.equalsIgnoreCase("yes");

        System.out.println("\nJob Eligibility Result");
        System.out.println("----------------------");
        System.out.println("Name: " + name);

        if (eligible) {
            System.out.println("Status: Eligible for Job");
        } else {
            System.out.println("Status: Not Eligible for Job");
        }

        sc.close();
    }
}
