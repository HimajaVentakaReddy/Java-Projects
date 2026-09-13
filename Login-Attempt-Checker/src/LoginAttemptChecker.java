import java.util.Scanner;

public class LoginAttemptChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String correctUsername = "admin";
        final String correctPassword = "java123";
        final int maximumAttempts = 3;

        boolean loginSuccessful = false;
        int attempt;

        System.out.println("======================================");
        System.out.println("        LOGIN ATTEMPT CHECKER");
        System.out.println("======================================");
        System.out.println("Maximum login attempts: " + maximumAttempts);

        for (attempt = 1; attempt <= maximumAttempts; attempt++) {
            System.out.println("\n---------- Attempt " + attempt + " of "
                    + maximumAttempts + " ----------");

            System.out.print("Enter username: ");
            String username = scanner.nextLine().trim();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Login failed: Fields cannot be empty.");
            } else if (username.equals(correctUsername)
                    && password.equals(correctPassword)) {
                loginSuccessful = true;

                System.out.println("\nLogin successful!");
                System.out.println("Welcome, " + username + ".");
                System.out.println("Logged in on attempt number " + attempt + ".");
                break;
            } else {
                int remainingAttempts = maximumAttempts - attempt;

                System.out.println("Login failed: Invalid username or password.");

                if (remainingAttempts > 0) {
                    System.out.println("Remaining attempts: "
                            + remainingAttempts);
                }
            }
        }

        System.out.println("\n------------ LOGIN STATUS ------------");

        if (loginSuccessful) {
            System.out.println("Status  : ACCESS GRANTED");
            System.out.println("Security: User credentials verified");
        } else {
            System.out.println("Status  : ACCOUNT LOCKED");
            System.out.println("Security: Maximum login attempts exceeded");
            System.out.println("Action  : Contact the administrator");
        }

        System.out.println("======================================");

        scanner.close();
    }
}