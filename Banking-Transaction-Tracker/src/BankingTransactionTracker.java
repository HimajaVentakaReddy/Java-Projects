import java.util.Scanner;

public class BankingTransactionTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        int choice = 0;

        do {
            System.out.println("\n=== Banking Transaction Tracker ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid menu number.");
                sc.next();
                continue;
            }

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    if (!sc.hasNextDouble()) {
                        System.out.println("Please enter a valid amount.");
                        sc.next();
                        break;
                    }
                    double deposit = sc.nextDouble();

                    if (deposit <= 0) {
                        System.out.println("Amount must be greater than zero.");
                    } else {
                        balance += deposit;
                        System.out.printf("Deposit successful. Balance: %.2f%n", balance);
                    }
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    if (!sc.hasNextDouble()) {
                        System.out.println("Please enter a valid amount.");
                        sc.next();
                        break;
                    }
                    double withdrawal = sc.nextDouble();

                    if (withdrawal <= 0) {
                        System.out.println("Amount must be greater than zero.");
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdrawal;
                        System.out.printf("Withdrawal successful. Balance: %.2f%n", balance);
                    }
                    break;

                case 3:
                    System.out.printf("Current balance: %.2f%n", balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the tracker!");
                    break;

                default:
                    System.out.println("Invalid choice. Select 1 to 4.");
            }
        } while (choice != 4);

        sc.close();
    }
}

