
import java.util.Scanner;

public class TriangleTypeIdentifier {

    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continueProgram = true;

            while (continueProgram) {
                double side1 = 0, side2 = 0, side3 = 0;

                while (true) {
                    System.out.print("Enter side 1: ");
                    if (scanner.hasNextDouble()) {
                        side1 = scanner.nextDouble();
                        if (side1 > 0) {
                            break;
                        } else {
                            System.out.println("Side length must be positive.");
                        }
                    } else {
                        System.out.println("Side length must be positive.");
                        scanner.next();
                    }
                }
                while (true) {
                    System.out.print("Enter side 2: ");
                    if (scanner.hasNextDouble()) {
                        side2 = scanner.nextDouble();
                        if (side2 > 0) {
                            break;
                        } else {
                            System.out.println("Side length must be positive.");
                        }
                    } else {
                        System.out.println("Side length must be positive.");
                        scanner.next();
                    }
                }

                while (true) {
                    System.out.print("Enter side 3: ");
                    if (scanner.hasNextDouble()) {
                        side3 = scanner.nextDouble();
                        if (side3 > 0) {
                            break;
                        } else {
                            System.out.println("Side length must be positive.");
                        }
                    } else {
                        System.out.println("Side length must be positive.");
                        scanner.next();
                    }
                }

                // check if sides form a valid triangle
                if (side1 + side2 > side3
                        && side1 + side3 > side2
                        && side2 + side3 > side1) {

                    // Determine triangle type
                    if (side1 == side2 && side2 == side3) {
                        System.out.println("The triangle is Equilateral.");
                    } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                        System.out.println("The triangle is Isosceles.");
                    } else {
                        System.out.println("The triangle is Scalene.");
                    }
                } else {
                    System.out.println("The sides do not form a valid triangle.");

                }

                System.out.println("Do you want to check another triangle? (yes / no): ");
                String response = scanner.next();
                if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("y")) {
                    continueProgram = false;
                }

            }
            System.out.println("Program ended");
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // public static void main(String[] args) {
    //     triangleTypeIdentifier identifier = new triangleTypeIdentifier();
    //     identifier.run();
    // }
}
