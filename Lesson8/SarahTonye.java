import java.util.Scanner;

public class SarahTonye {
    public static void main(String[] args) {
        System.out.println();

        // 1. Initialize sarahsSelectedValue to 1
        int sarahsSelectedValue = 1;

        // 2. Initialize tonyesSelectedValue to Tonye's current Guess
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hey Tonye, what's your guess? ");
        int tonyesCurrentGuess = keyboard.nextInt();
        keyboard.close();

        int tonyesSelectedValue = tonyesCurrentGuess;

        // 3. tonyesSelectedValue is equal to sarahsSelectedValue
        if(tonyesSelectedValue == sarahsSelectedValue)
            System.out.println("Yay!! It is; come get it from my dorm later, after dinner");
        else 
            System.out.println("Aww, sorry. My number is " + sarahsSelectedValue);

        System.out.println();
    }
}
