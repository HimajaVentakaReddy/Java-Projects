import java.util.Scanner;

public class EmployeeAttendanceTracker {
    private static final int TOTAL_DAYS = 30;

    private static int readAttendance(Scanner scanner, String employeeName) {
        while (true) {
            System.out.print("Enter days present for " + employeeName
                    + " (0-" + TOTAL_DAYS + "): ");
            String input = scanner.nextLine().trim();

            try {
                int days = Integer.parseInt(input);

                if (days >= 0 && days <= TOTAL_DAYS) {
                    return days;
                }
            } catch (NumberFormatException e) {
                // Ask again if the input is not an integer.
            }

            System.out.println("Invalid input. Enter a whole number from 0 to "
                    + TOTAL_DAYS + ".");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Employee Attendance Tracker ===");

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Employee name cannot be empty.");
            scanner.close();
            return;
        }

        int daysPresent = readAttendance(scanner, name);
        int daysAbsent = TOTAL_DAYS - daysPresent;
        double attendancePercentage =
                (daysPresent * 100.0) / TOTAL_DAYS;

        System.out.println("\n======= Attendance Report =======");
        System.out.println("Employee Name : " + name);
        System.out.println("Working Days  : " + TOTAL_DAYS);
        System.out.println("Days Present  : " + daysPresent);
        System.out.println("Days Absent   : " + daysAbsent);
        System.out.printf("Attendance    : %.2f%%%n", attendancePercentage);
        if (attendancePercentage >= 75) {
            System.out.println("Status        : Good Attendance");
        } else {
            System.out.println("Status        : Low Attendance");
        }

        System.out.println("=================================");
        scanner.close();
    }
}
