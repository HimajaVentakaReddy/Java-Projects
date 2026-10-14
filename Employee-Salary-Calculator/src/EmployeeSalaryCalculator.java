import java.util.Scanner;

class Employee {
    protected String name;
    protected double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }
}

class Manager extends Employee {
    public Manager(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return basicSalary + (basicSalary * 0.20);
    }
}

class Developer extends Employee {
    public Developer(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return basicSalary + (basicSalary * 0.10);
    }
}

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Employee Salary Calculator ===");
        System.out.println("1. Manager (20% allowance)");
        System.out.println("2. Developer (10% allowance)");

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Employee name cannot be empty.");
            scanner.close();
            return;
        }

        System.out.print("Enter basic salary: ");
        String salaryInput = scanner.nextLine().trim();

        double basicSalary;
        try {
            basicSalary = Double.parseDouble(salaryInput);
            if (!Double.isFinite(basicSalary) || basicSalary <= 0) {
                System.out.println("Salary must be a positive number.");
                scanner.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid salary.");
            scanner.close();
            return;
        }

        System.out.print("Select employee type (1-2): ");
        String typeInput = scanner.nextLine().trim();

        Employee employee;

        if (typeInput.equals("1")) {
            employee = new Manager(name, basicSalary);
        } else if (typeInput.equals("2")) {
            employee = new Developer(name, basicSalary);
        } else {
            System.out.println("Invalid employee type.");
            scanner.close();
            return;
        }

        System.out.println("\n=== Salary Details ===");
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Type : "
                + (employee instanceof Manager ? "Manager" : "Developer"));
        System.out.printf("Basic Salary  : Rs. %.2f%n", basicSalary);
        System.out.printf("Final Salary  : Rs. %.2f%n",
                employee.calculateSalary());

        scanner.close();
    }
}