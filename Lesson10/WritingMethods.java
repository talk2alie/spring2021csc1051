import java.util.*;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Add;

/**
 * WritingMethods
 */
public class WritingMethods {

    // 1. Print Greeting
    // 2. Ask user for name
    // 3. Print Welcome <user>
    // 4. Ask user for first number
    // 5. Ask user for second number
    // 6. Give user an option to enter Add | Subtract | Multiply | Divide
    // 7. Perform arithemetic and return value
    // 8. Print value

    public static void main(String[] args) {
        System.out.println();

        // 1. 
        System.out.println("Welcome modern Calculator!");

        Scanner keyboard = new Scanner(System.in);
        // 2. 
        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine();

        // 3. 
        System.out.printf("Welcome %s\n", name);

        // 4.
        System.out.print("Please enter your first number: ");
        double firstNumber = keyboard.nextDouble();

        // 5.
        System.out.println("Please enter your second number: ");
        double secondNumber = keyboard.nextDouble();

        // 6.
        System.out.println("Please one of the following to perform arithmetic: \"Add\" | \"Subtract\" | \"Divide\" | \"Multiply\"");
        String operation = keyboard.nextLine().toUpperCase();
        keyboard.close();

        // 7.
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

        System.out.printf("When you %s %f to %f, you get %f", operation, firstNumber, secondNumber, result);

        System.out.println();
    }
}