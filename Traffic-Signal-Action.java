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
        } else if (signal.equalsIgnoreCase("yellow")) {
            System.out.println("Action: WAIT");
        } else if (signal.equalsIgnoreCase("green")) {
            System.out.println("Action: GO");
        } else {
            System.out.println("Invalid traffic signal color.");
        }

        System.out.println("================================");

        scanner.close();
    }
}
