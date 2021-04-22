import java.util.*;

/**
 * WritingMethods
 */
public class WritingMethods {
    public static void main(String[] args) {
        System.out.println();

        Arithmetic.greet("Welcome to modern Calculator", null);

        Scanner keyboard = new Scanner(System.in);
        String name = Arithmetic.getUserName(keyboard);
        
        Arithmetic.greet("Welcome", name);
        
        double firstNumber = Arithmetic.getNumberFrom(keyboard);
        double secondNumber = Arithmetic.getNumberFrom(keyboard);

        keyboard.nextLine();

        System.out.println("Please pick one of the following to perform arithmetic: \"Add\" | \"Subtract\" | \"Divide\" | \"Multiply\"");
        String operation = keyboard.nextLine().toUpperCase();
        keyboard.close();

        double result = Arithmetic.performArithmetic(firstNumber, secondNumber, operation);

        System.out.printf("When you %s %.1f to %.1f, you get %.1f", operation, firstNumber, secondNumber, result);

        System.out.println();
    }

    
}