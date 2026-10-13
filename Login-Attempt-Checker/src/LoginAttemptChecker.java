import java.util.Scanner;

class LoginSystem {
    private final String correctUsername = "admin";
    private final String correctPassword = "java123";
    private int attempts = 0;
    private final int maximumAttempts = 3;

    public boolean isLocked() {
        return attempts >= maximumAttempts;
    }

    public boolean login(String username, String password) {
        if (isLocked()) {
            System.out.println("Account is locked.");
            return false;
        }

        attempts++;

        if (correctUsername.equals(username)
                && correctPassword.equals(password)) {
            System.out.println("Login successful! Welcome, " + username + ".");
            return true;
        }

        System.out.println("Login failed. Attempts used: " + attempts);

        if (isLocked()) {
            System.out.println("Account locked after maximum attempts.");
        } else {
            System.out.println("Attempts remaining: "
                    + (maximumAttempts - attempts));
        }

        return false;
    }
}

public class LoginAttemptChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginSystem loginSystem = new LoginSystem();

        System.out.println("==================================");
        System.out.println("    OOP LOGIN ATTEMPT CHECKER");
        System.out.println("==================================");

        while (!loginSystem.isLocked()) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine().trim();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Username and password are required.");
                continue;
            }

            if (loginSystem.login(username, password)) {
                break;
            }
        }

        scanner.close();
    }
}