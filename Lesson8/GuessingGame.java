import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println();

        // Step 1.
        int mohamedsNumber = 3;

        // Step 2. Get guess
        var keyboard = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 5, inclusive: ");
        int guess = keyboard.nextInt();
        keyboard.close();

        // Step 3. 
        if(guess == mohamedsNumber) {
            System.out.println("Success");
        }
        else {
            System.out.println("Failure");
        }

        System.out.println();
    }
}
