import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade point for subject " + i + ": ");
            double grade = sc.nextDouble();

            total += grade;
        }

        double cgpa = total / n;

        System.out.printf("\nYour CGPA: %.2f\n", cgpa);

        sc.close();
    }
}
