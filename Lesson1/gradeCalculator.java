
import java.util.Scanner;

public class GradeCalculator {

    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a numerical grade (0 - 100): ");
            int grade = scanner.nextInt();
            if (grade < 0 || grade > 100) {
                System.out.println("Grade must be between 0 and 100.");
                return;
            }

            String letterGrade;

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

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numerical grade between 0 and 100.");
        }
    }

    /*  public static void main(String[] args) {
        gradeCalculator calculator = new gradeCalculator();
        calculator.run();
    }*/
}
