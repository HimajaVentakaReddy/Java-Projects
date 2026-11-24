import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class TextFileNoteManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== TEXT FILE NOTE MANAGER =====");
        System.out.println("1. Add a Note");
        System.out.println("2. View Saved Notes");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        try {
            if (choice == 1) {
                System.out.print("Enter your note: ");
                String note = sc.nextLine();

                FileWriter writer = new FileWriter("MyNotes.txt", true);
                writer.write(note + System.lineSeparator());
                writer.close();

                System.out.println("Note saved successfully!");

            } else if (choice == 2) {
                File file = new File("MyNotes.txt");

                if (file.exists()) {
                    Scanner reader = new Scanner(file);

                    System.out.println("\n===== SAVED NOTES =====");

                    while (reader.hasNextLine()) {
                        System.out.println(reader.nextLine());
                    }

                    reader.close();
                } else {
                    System.out.println("No notes found!");
                }

            } else {
                System.out.println("Invalid choice!");
            }

        } catch (IOException e) {
            System.out.println("File operation failed!");
        }

        sc.close();
    }
}

