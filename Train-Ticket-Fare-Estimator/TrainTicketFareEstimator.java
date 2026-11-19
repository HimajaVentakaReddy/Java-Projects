

        System.out.println("===== TRAIN TICKET FARE ESTIMATOR =====");

        System.out.print("Enter travel distance in km: ");
        double distance = sc.nextDouble();

        System.out.println("\nSelect Travel Class:");
        System.out.println("1. Sleeper - Rs. 1.50/km");
        System.out.println("2. AC 3 Tier - Rs. 2.50/km");
        System.out.println("3. AC 2 Tier - Rs. 3.50/km");

        System.out.print("Enter class choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter number of passengers: ");
        int passengers = sc.nextInt();

        double rate = 0;

        switch (choice) {
            case 1:
                rate = 1.50;
                break;
            case 2:
                rate = 2.50;
                break;
            case 3:
                rate = 3.50;
                break;
            default:
                System.out.println("Invalid class selection!");
        }

        if (distance <= 0 || passengers <= 0 || passengers > 10) {
            System.out.println("Invalid travel details!");
        } else if (rate > 0) {
            double fare = distance * rate * passengers;

            System.out.println("\n===== FARE DETAILS =====");
            System.out.println("Distance: " + distance + " km");
            System.out.println("Passengers: " + passengers);
            System.out.printf("Fare Per Passenger: Rs. %.2f%n", distance * rate);
            System.out.printf("Total Ticket Fare: Rs. %.2f%n", fare);
        }

        sc.close();
    }
}
