
import java.util.Scanner;

public class GradeCalculator {

    public void run(Scanner scanner) {
        try {
            boolean continueProgram = true;

            while (continueProgram) {
                int grade = - 1;
                String letterGrade;

                while (true) {
                    System.out.print("Enter a numerical grade (0 - 100): ");
                    if (scanner.hasNextInt()) {
                        grade = scanner.nextInt();
                        if (grade < 0 || grade > 100) {
                            System.out.println("\nGrade must be between 0 and 100.");
                        } else {
                            break;
                        }
                    } else {
                        System.out.println("\nInvalid input. Please type a number");
                        scanner.next();
                    }
                }

                if (grade >= 90) {
                    letterGrade = "A";
                } else if (grade >= 80) {
                    letterGrade = "B";
                } else if (grade >= 70) {
                    letterGrade = "C";
                } else if (grade >= 60) {
                    letterGrade = "D";
                } else {
                    letterGrade = "F";
                }

                System.out.println("Letter Grade: " + letterGrade);

                System.out.println("\nDo you want to check a grade again? (yes/no): ");
                String response = scanner.next();
                if (!response.equalsIgnoreCase("yes") || !response.equalsIgnoreCase("y")) {
                    continueProgram = false;
                }
            }

        } catch (Exception e) {
            System.out.println("An error occurred." + e.getMessage());
        }
    }

    /*  public static void main(String[] args) {
        gradeCalculator calculator = new gradeCalculator();
        calculator.run();
    }*/
}
