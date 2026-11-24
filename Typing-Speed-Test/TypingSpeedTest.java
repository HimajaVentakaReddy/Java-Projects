import java.util.Scanner;

public class TypingSpeedTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = "Java programming is interesting and useful";

        System.out.println("===== TYPING SPEED TEST =====");
        System.out.println("Type the following sentence:");
        System.out.println(sentence);

        System.out.print("\nEnter your typed sentence: ");
        String typed = sc.nextLine();

        int correct = 0;
        int length = Math.min(sentence.length(), typed.length());

        for (int i = 0; i < length; i++) {
            if (sentence.charAt(i) == typed.charAt(i)) {
                correct++;
            }
        }

        double accuracy = (correct * 100.0) / sentence.length();

        System.out.println("\n===== TEST REPORT =====");
        System.out.println("Expected Characters: " + sentence.length());
        System.out.println("Correct Characters: " + correct);
        System.out.println("Typed Characters: " + typed.length());
        System.out.printf("Accuracy: %.2f%%%n", accuracy);

        if (accuracy >= 90) {
            System.out.println("Performance: Excellent!");
        } else if (accuracy >= 60) {
            System.out.println("Performance: Good!");
        } else {
            System.out.println("Performance: Needs Practice");
        }

        sc.close();
    }
}

