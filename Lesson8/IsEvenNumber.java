import java.util.Scanner;

/**
 * 1. The program should ask a user for a number
 * 2. The program should print: "Even" for even numbers
 * 3. The program should print: "Odd" for numbers that are not even
 */
public class IsEvenNumber {
    public static void main(String[] args) {
        System.out.println();

        int usersNumber;
        var keyboard = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        usersNumber = keyboard.nextInt();
        keyboard.close();

        String message;
        if((usersNumber % 2) == 0) {
            message = "Even";
            if(usersNumber > 10) {
                message += " and greater than 10";
            }
            else {
                message += " but not greater than 10";
            }
        }
        else {
            message = "Odd";
            if(usersNumber > 10) {
                message += " and greater than 10";
            }
            else {
                message += " but not greater than 10";
            }
        }
        System.out.println(message);

        System.out.println();
    }
}
