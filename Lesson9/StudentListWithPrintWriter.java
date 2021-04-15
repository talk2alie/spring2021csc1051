import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentListWithPrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println();

        var keyboard = new Scanner(System.in);
        var printWriter = new PrintWriter("files/students.csv");
        String isComplete = "no";

        printWriter.printf("%-25s,%-25s,%-25s\n", "Name", "Major", "Expected Graduation Year");

        do {
            System.out.println();

            System.out.print("Please enter student's name: ");
            String studentsName = keyboard.nextLine();

            System.out.print("Please enter student's major: ");
            String studentsMajor = keyboard.nextLine();

            System.out.print("Please enter student's expected graduation year: ");
            int studentsGraduationYear = keyboard.nextInt();

            // Clear cache
            keyboard.nextLine();

            System.out.print("Is your list complete? ");
            isComplete = keyboard.nextLine().trim();

            printWriter.printf("%-25s,%-25s,%d\n", studentsName, studentsMajor, studentsGraduationYear);
        } while(isComplete.equalsIgnoreCase("no"));

        keyboard.close();
        printWriter.close();

        System.out.println();
    }
}
