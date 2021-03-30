import java.util.Scanner;
public class NumericToLetterGrade {
    public static void main(String[] args) {
        System.out.println();
        double grade = 0.0;
        var keyboard = new Scanner(System.in);
        System.out.print("Please enter your numeric grade: ");
        grade = keyboard.nextDouble();
        keyboard.close();
        String message = "Your grade is ";
        if(grade < 64) {
            message += "D-";
        } else if(grade < 67) {
            message += "D";
        } else if(grade < 70) {
            message += "D+";
        } else if(grade < 74) {
            message += "C-";
        } else if(grade < 77) {
            message += "C";
        } else if(grade < 80) {
            message += "C+";
        } else if(grade < 84) {
            message += "B-";
        } else  if(grade < 87) {
            message += "B";
        } else if(grade < 90) {
            message += "B+";
        } else if(grade < 95) {
            message += "A-";
        } else {
            message += "A";
        }
        System.out.println(message);
        System.out.println();
    }
}

