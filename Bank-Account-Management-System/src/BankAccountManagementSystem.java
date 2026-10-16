import java.util.Scanner;

class BankAccount {
    private final String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double openingBalance) {
        this.accountHolder = accountHolder;
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        if (Double.isFinite(amount) && amount > 0) {
            balance += amount;
            System.out.printf("Deposit successful. Balance: Rs. %.2f%n", balance);
        } else {
            System.out.println("Enter a valid positive amount.");
        }
    }

    public void withdraw(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            System.out.println("Enter a valid positive amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.printf("Withdrawal successful. Balance: Rs. %.2f%n", balance);
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.printf("Current Balance: Rs. %.2f%n", balance);
    }
}

public class BankAccountManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            scanner.close();
            return;
        }

        System.out.print("Enter opening balance: ");
        double openingBalance;

        try {
            openingBalance = Double.parseDouble(scanner.nextLine().trim());
            if (!Double.isFinite(openingBalance) || openingBalance < 0) {
                System.out.println("Opening balance must be zero or more.");
                scanner.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid amount.");
            scanner.close();
            return;
        }

        BankAccount account = new BankAccount(name, openingBalance);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Bank Account Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter deposit amount: ");
                    try {
                        account.deposit(Double.parseDouble(scanner.nextLine().trim()));
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid amount.");
                    }
                    break;

                case "2":
                    System.out.print("Enter withdrawal amount: ");
                    try {
                        account.withdraw(Double.parseDouble(scanner.nextLine().trim()));
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid amount.");
                    }
                    break;

                case "3":
                    account.displayBalance();
                    break;

                case "4":
                    running = false;
                    System.out.println("Thank you for using the bank system.");
                    break;

                default:
                    System.out.println("Invalid option. Choose 1-4.");
            }
        }

        scanner.close();
    }
}