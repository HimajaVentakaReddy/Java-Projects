import java.util.Scanner;

public class LoanEMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan amount (Rs.): ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter loan period (years): ");
        int years = sc.nextInt();

        if (principal <= 0 || rate <= 0 || years <= 0) {
            System.out.println("Invalid input!");
        } else {
            double monthlyRate = rate / (12 * 100);
            int months = years * 12;

            double emi = principal * monthlyRate *
                    Math.pow(1 + monthlyRate, months) /
                    (Math.pow(1 + monthlyRate, months) - 1);

            System.out.printf("Monthly EMI: Rs. %.2f%n", emi);
        }

        sc.close();
    }
}
