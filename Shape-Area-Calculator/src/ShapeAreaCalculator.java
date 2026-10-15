import java.util.Scanner;

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Shape Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Choose a shape (1-2): ");

        String choice = scanner.nextLine().trim();

        try {
            Shape shape;

            if (choice.equals("1")) {
                System.out.print("Enter circle radius: ");
                double radius = Double.parseDouble(scanner.nextLine().trim());

                if (!Double.isFinite(radius) || radius <= 0) {
                    System.out.println("Radius must be a positive number.");
                    scanner.close();
                    return;
                }

                shape = new Circle(radius);

            } else if (choice.equals("2")) {
                System.out.print("Enter rectangle length: ");
                double length = Double.parseDouble(scanner.nextLine().trim());

                System.out.print("Enter rectangle width: ");
                double width = Double.parseDouble(scanner.nextLine().trim());

                if (!Double.isFinite(length) || !Double.isFinite(width)
                        || length <= 0 || width <= 0) {
                    System.out.println("Length and width must be positive numbers.");
                    scanner.close();
                    return;
                }

                shape = new Rectangle(length, width);

            } else {
                System.out.println("Invalid choice.");
                scanner.close();
                return;
            }

            System.out.printf("Area: %.2f%n", shape.calculateArea());

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers.");
        }

        scanner.close();
    }
}