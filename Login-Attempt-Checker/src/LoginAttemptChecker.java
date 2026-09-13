import java.util.Scanner;

public class LoginAttemptChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "java123";

        System.out.println("================================");
        System.out.println("       LOGIN ATTEMPT CHECKER");
        System.out.println("================================");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername) &&
                password.equals(correctPassword)) {
            System.out.println("\nLogin successful!");
            System.out.println("Welcome, " + username + ".");
        } else {
            System.out.println("\nLogin failed!");
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}