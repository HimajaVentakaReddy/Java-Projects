import java.util.Scanner;

public class ContactDirectoryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== CONTACT DIRECTORY MANAGER =====");

        System.out.print("Enter number of contacts: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Invalid contact count!");
            sc.close();
            return;
        }

        String[] names = new String[n];
        String[] phones = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter contact name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter phone number: ");
            phones[i] = sc.nextLine();
        }

        System.out.println("\n===== SAVED CONTACTS =====");

        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " : " + phones[i]);
        }

        System.out.print("\nEnter name to search: ");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                System.out.println("Contact Found!");
                System.out.println("Name: " + names[i]);
                System.out.println("Phone: " + phones[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found!");
        }

        sc.close();
    }
}

