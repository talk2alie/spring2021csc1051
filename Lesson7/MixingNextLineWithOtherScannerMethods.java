// Step 1. Import the Scanner class
import java.util.Scanner;
public class MixingNextLineWithOtherScannerMethods {
    public static void main(String[] args) {
        System.out.println();
        String name; byte age; double income;
        /* Step 2. Declare and initialze a Scanner variable
                   Make sure to pass System.in to the constructor */
        Scanner keyboard = new Scanner(System.in);
        // Step 3. Ask the user for their age
        System.out.print("How old are you? ");
        // Step 4. Read the user's age and store it in a byte variable
        age = keyboard.nextByte();
        // Step 5. Ask the user for their weekly income
        System.out.print("What is your weekly income? ");
        // Step 6. Read the user's income and store it in a double variable
        income = keyboard.nextDouble();
        // Consume the whitespace characters from the buffer
        keyboard.nextLine();
        // Step 6. Ask the user for their name
        System.out.print("What is your name? ");
        // Step 7. Read the user's name and store it in a string variable
        name = keyboard.nextLine();
        // Display the information tback to the user
        System.out.println("Hi, " + name + ".\n\nYour are " + age + " years old, and you " +
                           "are already making $" + income + " per week.");
        keyboard.close();
        System.out.println();
    }
}



