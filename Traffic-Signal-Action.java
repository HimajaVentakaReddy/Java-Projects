import java.util.Scanner;

public class TrafficSignalAction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       TRAFFIC SIGNAL ACTION");
        System.out.println("================================");

        System.out.print("Enter traffic signal color: ");
        String signal = scanner.nextLine();

        if (signal.equalsIgnoreCase("red")) {
            System.out.println("Action: STOP");
            System.out.println("Signal Duration: 60 seconds");
        } else if (signal.equalsIgnoreCase("yellow")) {
            System.out.println("Action: WAIT");
            System.out.println("Signal Duration: 5 seconds");
        } else if (signal.equalsIgnoreCase("green")) {
            System.out.println("Action: GO");
            System.out.println("Signal Duration: 45 seconds");
        } else {
            System.out.println("Invalid traffic signal color.");
        }

        System.out.println("================================");

        scanner.close();
    }
}
