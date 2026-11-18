import java.util.Scanner;

public class DigitalQuizManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "Which language is used for Android development?",
            "Which keyword creates an object in Java?",
            "Which symbol ends a Java statement?",
            "Which method is the starting point of Java?"
        };

        String[] options = {
            "1. Python  2. Java  3. HTML",
            "1. new  2. class  3. void",
            "1. :  2. ,  3. ;",
            "1. start()  2. main()  3. run()"
        };

        int[] answers = {2, 1, 3, 2};
        int score = 0;

        System.out.println("===== DIGITAL QUIZ SYSTEM =====");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            System.out.println(options[i]);

            System.out.print("Enter your answer: ");
            int choice = sc.nextInt();

            if (choice == answers[i]) {
                System.out.println("Correct Answer!");
                score++;
            } else {
                System.out.println("Wrong Answer!");
            }
        }

        System.out.println("\n===== QUIZ RESULT =====");
        System.out.println("Total Questions: " + questions.length);
        System.out.println("Correct Answers: " + score);
        System.out.println("Wrong Answers: " + (questions.length - score));
        System.out.println("Final Score: " + score + "/" + questions.length);

        sc.close();
    }
}

