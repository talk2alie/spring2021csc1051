import java.util.*;
import people.*;

/**
 * WritingMethods
 */
public class WritingMethods {
    public static void main(String[] args) throws Exception {
        System.out.println();
        
        var person = new Student(1, "Mohamed", "A.", "Pussah II", "1983-03-06", "mpussah@villanova.edu");
        person.setMajor("Computer Science");
        // person.setMinor("Studio Arts");
        System.out.println(person);

        // Arithmetic.greet("Welcome to modern Calculator", null);

        // Scanner keyboard = new Scanner(System.in);
        // String name = Arithmetic.getUserName(keyboard);
        
        // Arithmetic.greet("Welcome", name);
        
        // double firstNumber = Arithmetic.getNumberFrom(keyboard);
        // double secondNumber = Arithmetic.getNumberFrom(keyboard);

        // keyboard.nextLine();

        // System.out.println("Please pick one of the following to perform arithmetic: \"Add\" | \"Subtract\" | \"Divide\" | \"Multiply\"");
        // String operation = keyboard.nextLine().toUpperCase();
        // keyboard.close();

        // double result = Arithmetic.performArithmetic(firstNumber, secondNumber, operation);

        // System.out.printf("When you %s %.1f to %.1f, you get %.1f", operation, firstNumber, secondNumber, result);

        System.out.println();
    }

    
}