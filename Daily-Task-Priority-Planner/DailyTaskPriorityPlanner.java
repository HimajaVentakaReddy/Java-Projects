import java.util.Scanner;

public class DailyTaskPriorityPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== DAILY TASK PRIORITY PLANNER =====");

        System.out.print("Enter number of tasks: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Invalid number of tasks!");
            sc.close();
            return;
        }

        String[] tasks = new String[n];
        int[] priority = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter task name: ");
            tasks[i] = sc.nextLine();

            System.out.print("Enter priority (1-High, 2-Medium, 3-Low): ");
            priority[i] = sc.nextInt();
            sc.nextLine();

            if (priority[i] < 1 || priority[i] > 3) {
                System.out.println("Invalid priority!");
                sc.close();
                return;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (priority[i] > priority[j]) {
                    int temp = priority[i];
                    priority[i] = priority[j];
                    priority[j] = temp;

                    String tempTask = tasks[i];
                    tasks[i] = tasks[j];
                    tasks[j] = tempTask;
                }
            }
        }

        System.out.println("\n===== PRIORITY-WISE TASK LIST =====");

        for (int i = 0; i < n; i++) {
            String level = "";

            if (priority[i] == 1) {
                level = "High";
            } else if (priority[i] == 2) {
                level = "Medium";
            } else {
                level = "Low";
            }

            System.out.println((i + 1) + ". " + tasks[i] + " - " + level);
        }

        sc.close();
    }
}
