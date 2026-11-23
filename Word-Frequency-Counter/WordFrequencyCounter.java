import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== WORD FREQUENCY COUNTER =====");

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("Please enter a valid sentence!");
            sc.close();
            return;
        }

        String[] words = sentence.toLowerCase().split("\\s+");

        int maxFrequency = 0;
        String mostFrequent = "";

        System.out.println("\nTotal Words: " + words.length);
        System.out.println("Total Characters: " + sentence.length());

        System.out.println("\n===== WORD FREQUENCY =====");

        for (int i = 0; i < words.length; i++) {
            int count = 0;

            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (words[i].equals(words[k])) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                System.out.println(words[i] + " : " + count);

                if (count > maxFrequency) {
                    maxFrequency = count;
                    mostFrequent = words[i];
                }
            }
        }

        System.out.println("\nMost Frequent Word: " + mostFrequent);
        System.out.println("Frequency: " + maxFrequency);

        sc.close();
    }
}
