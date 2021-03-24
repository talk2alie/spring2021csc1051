import java.util.Scanner;

public class TextReader {
    public static void main(String[] args) {
        System.out.println();

        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Please enter a character: ");
        String userInput = keyboard.nextLine();
        //15
        char character = userInput.charAt(0);
        keyboard.close();

        /*
            System.out.print("Please enter your age: ");
            byte usersAge = keyboard.nextByte();
            System.out.println("You are " + usersAge + " years old");
        */

        System.out.println();
    }
}

