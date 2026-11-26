import java.util.Scanner;

public class FileExtensionAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== FILE EXTENSION ANALYZER =====");

        System.out.print("Enter number of files: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Invalid file count!");
            sc.close();
            return;
        }

        String[] files = new String[n];
        int javaCount = 0;
        int pdfCount = 0;
        int imageCount = 0;
        int otherCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter file name: ");
            files[i] = sc.nextLine();

            String name = files[i].toLowerCase();

            if (name.endsWith(".java")) {
                javaCount++;
            } else if (name.endsWith(".pdf")) {
                pdfCount++;
            } else if (name.endsWith(".jpg") ||
                       name.endsWith(".png")) {
                imageCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("\n===== FILE ANALYSIS REPORT =====");
        System.out.println("Java Files: " + javaCount);
        System.out.println("PDF Files: " + pdfCount);
        System.out.println("Image Files: " + imageCount);
        System.out.println("Other Files: " + otherCount);
        System.out.println("Total Files: " + n);

        sc.close();
    }
}


