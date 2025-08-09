
import java.util.Scanner;

public class ticketPriceCalculator {

    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continueProgram = true;

            while (continueProgram) {
                int age = -1;

                while (true) {
                    System.out.print("Enter you age: ");
                    if (scanner.hasNextInt()) {
                        age = scanner.nextInt();
                        if (age >= 0 && age <= 120) {
                            break;
                        } else {
                            System.out.println("Invalid age. Please enter a number between 0 and 120.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a whole number.");
                        scanner.next(); // Clear the invalid input
                    }
                }
                // Determine ticket price
                double price;
                if (age >= 65 || age <= 12) {
                    price = 7.0;
                } else {
                    price = 10.0;
                }
                System.out.printf("Ticket price for age %d is: GHC%.2f%n", age, price);

                System.out.print("Do you want to check another ticket price? (yes/no): ");
                String response = scanner.next();
                if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("y")) {
                    continueProgram = false;
                }
            }
            System.out.println("Program ended.");
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ticketPriceCalculator calculator = new ticketPriceCalculator();
        calculator.run();
    }
}
