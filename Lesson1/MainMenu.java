
import java.util.*;

public class MainMenu {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continueProgram = true;

            while (continueProgram) {
                System.out.println("\nWelcome to our Multi-task Program!");
                System.out.println("1. Grade Calculator");
                System.out.println("2. Ticket Price Calculator");
                System.out.println("3. Triangle Type Identifier");
                System.out.println("4. Exit");
                System.out.print("Please select an option (1-4): ");

                try {
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1 -> {
                            GradeCalculator gradeCalc = new GradeCalculator();
                            gradeCalc.run();
                        }
                        case 2 -> {
                            TicketPriceCalculator ticketCalc = new TicketPriceCalculator();
                            ticketCalc.run();
                        }
                        case 3 -> {
                            TriangleTypeIdentifier triangleIdentifier = new TriangleTypeIdentifier();
                            triangleIdentifier.run();
                        }
                        case 4 -> {
                            continueProgram = false;
                            System.out.println("Exiting the program. Goodbye!");
                        }
                        default ->
                            System.out.println("Invalid choice. Please select a valid option.");
                    }

                } catch (Exception e) {
                    System.out.println("\nPlease type a valid number: " + e);
                    scanner.next();
                }
            }
        }
    }
}
