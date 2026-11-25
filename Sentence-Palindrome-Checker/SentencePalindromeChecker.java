import java.util.Scanner;

public class SentencePalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== SENTENCE PALINDROME CHECKER =====");

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "")
                              .toLowerCase();

        String reversed = "";

        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        System.out.println("\nOriginal: " + input);

        if (cleaned.length() == 0) {
            System.out.println("Please enter a valid sentence!");
        } else if (cleaned.equals(reversed)) {
            System.out.println("Result: It is a palindrome!");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }

        sc.close();
    }
}
