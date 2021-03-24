import java.util.Scanner;

/**
 * 1. Program should ask user for their name
 * 2. Program should check user's name for the given conditions
 *      a. The user's name begins with a vowel
 *      b. The user's name is at least 10 characters long
 * 3. The program should print information about the name
 */
public class NameChecker {
    public static void main(String[] args) {
        System.out.println();

        String usersName;

        System.out.print("Please enter your name: ");
        var keyboard = new Scanner(System.in);
        usersName = keyboard.nextLine();
        keyboard.close();

        String message = "";
        usersName = usersName.toUpperCase();
        if(usersName.startsWith("A") || 
           usersName.startsWith("E") ||
           usersName.startsWith("I") ||
           usersName.startsWith("O") ||
           usersName.startsWith("U")) {
               message = "Begins with a vowel";
        } else {
            message += "Begins with a consonant";
        }
        
        if(usersName.length() >= 10) {
            message += " and has at least 10 characters";
        } else {
            message += ", but does not have at least 10 characters";
        }
        System.out.println(message);

        System.out.println();
    }
}
