import java.util.Scanner;

public class WritingMethods {
    public static void main(String[] args) {
        System.out.println();

        // Greet
        greet();
        
        // Ask for name
        var keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine().trim();
        keyboard.close();

        // Print number of characters in name
        System.out.printf("There are %d characters in your name.", name.length());
        System.out.println();

        System.out.println();
    }

    private static void greet() {
        System.out.println("Welcome to our world!");
    }
}
