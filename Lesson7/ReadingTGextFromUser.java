import java.util.*; // Step 1.

public class ReadingTGextFromUser {
    public static void main(String[] args) {
        System.out.println();

        // Step. Instantiate a Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Step 3. Prompt the user to enter a value
        System.out.print("How old are you? ");

        // Step 4. Read the user's input
        byte age = keyboard.nextByte();

        // Step 5. Use the value however you choose
        System.out.println("You are " + age + " years old.");

        // Step 6. Close the scanner
        keyboard.close();

        System.out.println();
    }
}
