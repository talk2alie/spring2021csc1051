import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        System.out.println();

        var keyboard = new Scanner(System.in);
        System.out.print("How many students do you have? ");
        int numberOfStudents = keyboard.nextInt();

        System.out.print("How many grades do you have per student? ");
        int numberOfGradesPerStudent = keyboard.nextInt();

        // Clear buffer
        keyboard.nextLine();
        
        for(int i = 1; i <= numberOfStudents; i++) {
            double totalGrades = 0.0;
            
            System.out.println();
            System.out.printf("Please enter student %d's name: ", i);
            String studentName = keyboard.nextLine();

            totalGrades = currentStudentTotalGrades(keyboard, numberOfGradesPerStudent, totalGrades, studentName);

            // Clean buffer
            keyboard.nextLine();

            double average = totalGrades / numberOfGradesPerStudent;
            System.out.printf("%s's average grade is: %.1f.", studentName, average);
            System.out.println();
        }

        keyboard.close();

        System.out.println();
    }

    private static double currentStudentTotalGrades(Scanner keyboard, int numberOfGradesPerStudent, double totalGrades,
            String studentName) {
        for(int j = 1; j <= numberOfGradesPerStudent; j++) {
            System.out.printf("Please enter grade %d for %s: ", j, studentName);
            double grade = keyboard.nextDouble();
            totalGrades += grade;
        }
        return totalGrades;
    }
}
