import java.util.Scanner;

public class PasswordStrengthAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== PASSWORD STRENGTH ANALYZER =====");

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper = true;
            } else if (Character.isLowerCase(ch)) {
                lower = true;
            } else if (Character.isDigit(ch)) {
                digit = true;
            } else {
                special = true;
            }
        }

        int score = 0;

        if (password.length() >= 8) score++;
        if (upper) score++;
        if (lower) score++;
        if (digit) score++;
        if (special) score++;

        System.out.println("\n===== PASSWORD REPORT =====");

        if (score <= 2) {
            System.out.println("Password Strength: Weak");
        } else if (score <= 4) {
            System.out.println("Password Strength: Medium");
        } else {
            System.out.println("Password Strength: Strong");
        }

        System.out.println("Strength Score: " + score + "/5");

        sc.close();
    }
}
