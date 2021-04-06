import java.util.Scanner;

/**
 * Quiz5
 */
public class Quiz5 {
    public static void main(String[] args) {
        System.out.println();

        var keyboard = new Scanner(System.in);
        System.out.print("1. Please enter your name: ");
        String name = keyboard.nextLine();

        System.out.print("2. Please enter your height: ");
        double height = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print("3. Please enter your major: ");
        String major = keyboard.nextLine();

        System.out.print("4. Please enter your graduation year: ");
        short graduationYear = keyboard.nextShort();
        keyboard.nextLine();

        System.out.print("5. Please enter your minor, if you have one: ");
        String minor = keyboard.nextLine();
        keyboard.close();

        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        System.out.println("Here are some details about you:");
        System.out.println();
        System.out.printf("%-20s", "Name: ");
        System.out.print(name);
        System.out.println();
        System.out.printf("%-20s", "Height: ");
        System.out.printf("%.2f", height);
        System.out.println();
        System.out.printf("%-20s","Major: ");
        System.out.print(major);
        System.out.println();
        if(minor.length() > 0) {
            System.out.printf("%-20s", "Minor: ");
            System.out.print(minor);
            System.out.println();
        }
        System.out.printf("%-20s", "Graduation Year: ");
        System.out.print(graduationYear);
        System.out.println();
        
        System.out.println();

        final int currentYear = 2021;
        int remainingYears = graduationYear - currentYear;
        
        String congratsMessage = "Congratulations!! ";
        if(remainingYears == 0) {
            congratsMessage += "You are graduating this semester.";
        } else if(remainingYears < 0) {
            int adjustedRemainingYear = -1 * remainingYears;
            if(adjustedRemainingYear == 1) {
                congratsMessage += "You graduated a year ago.";
            } else {
                congratsMessage += "You graduated " + adjustedRemainingYear + " years ago.";
            }
        } else if(remainingYears == 1) {
            congratsMessage += "You are graduating in " + remainingYears + " year.";
        } else {
            congratsMessage += "You are graduating in " + remainingYears + " years.";
        }

        System.out.println(congratsMessage);

        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println();
    }
}