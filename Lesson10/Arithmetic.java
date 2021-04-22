import java.util.Scanner;

public class Arithmetic {
    public static double performArithmetic(double firstNumber, double secondNumber, String operation) {
        final String ADD = "ADD", 
                     SUBTRACT = "SUBTRACT",
                     DIVIDE = "DIVIDE",
                     MULTIPLY = "MULTIPLY";
        double result = 0.0; 
        switch(operation) {
            case ADD:
                result = firstNumber + secondNumber;
                break;
            case SUBTRACT:
                result = firstNumber - secondNumber;
                break;
            case DIVIDE:
                result = firstNumber / secondNumber;
                break;
            case MULTIPLY:
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Invalid Operation");
        }
        return result;
    }

    public static void greet(String message, String personToGreet) {
        if(personToGreet != null && personToGreet.length() > 0) {
            message += " " + personToGreet;
        }

        System.out.println(message);
    }

    public static String getUserName(Scanner console) {
        System.out.print("Please enter your name: ");
        String userName = console.nextLine();
        
        return userName;
    }

    public static double getNumberFrom(Scanner keyboard) {
        System.out.print("Please enter number: ");
        double number = keyboard.nextDouble();
        
        return number;
    }
}
