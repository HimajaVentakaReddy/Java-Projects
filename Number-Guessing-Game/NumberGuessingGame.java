import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;

        System.out.println("===== NUMBER GUESSING GAME =====");
        System.out.println("Guess a number between 1 and 100.");

        while (guess != secret) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Enter a number between 1 and 100!");
            } else if (guess < secret) {
                System.out.println("Too low! Try again.");
            } else if (guess > secret) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("\nCongratulations! You guessed correctly.");
                System.out.println("Attempts taken: " + attempts);
            }
        }

        sc.close();
    }
}
