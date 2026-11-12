import java.util.Scanner;

public class OnlineOrderTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== ONLINE ORDER DELIVERY TRACKER =====");

        System.out.print("Enter order ID: ");
        String orderId = sc.nextLine();

        System.out.println("\nSelect Order Status:");
        System.out.println("1. Order Placed");
        System.out.println("2. Packed");
        System.out.println("3. Shipped");
        System.out.println("4. Out for Delivery");
        System.out.println("5. Delivered");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.println("\n===== ORDER REPORT =====");
        System.out.println("Order ID: " + orderId);

        switch (choice) {
            case 1:
                System.out.println("Status: Order Placed");
                System.out.println("Message: Your order has been received.");
                break;

            case 2:
                System.out.println("Status: Packed");
                System.out.println("Message: Your order is packed.");
                break;

            case 3:
                System.out.println("Status: Shipped");
                System.out.println("Message: Your order is on the way.");
                break;

            case 4:
                System.out.println("Status: Out for Delivery");
                System.out.println("Message: Your order will arrive soon.");
                break;

            case 5:
                System.out.println("Status: Delivered");
                System.out.println("Message: Your order was delivered.");
                break;

            default:
                System.out.println("Invalid order status!");
        }

        sc.close();
    }
}

