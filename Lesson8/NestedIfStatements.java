import java.util.Scanner;
public class NestedIfStatements {
    public static void main(String[] args) {
        System.out.println();
        // 1.
        int sarahsSelectedLow = 1;
        // 2.
        int sarahsSelectedHigh = 5;
        // 3.
        var keyboard = new Scanner(System.in);
        System.out.print("Hey Tonye, please enter your guess: ");
        int guess = keyboard.nextInt();
        keyboard.close();
        int tonyesSelectedValue = guess;
        // 4.
        if(tonyesSelectedValue >= sarahsSelectedLow) {
            if(tonyesSelectedValue <= sarahsSelectedHigh) {
                System.out.println("Yay!! It is; come get it from my dorm later, after dinner");
            } else {
                System.out.println("Aww, sorry. Your number is above my range.");
            }
        } else {
            System.out.println("Aww, sorry. Your number is below my range.");
        }
        System.out.println();
    }
}

