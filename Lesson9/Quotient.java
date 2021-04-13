import java.util.Scanner;

/**
 * Quotient
 */
public class Quotient {

    public static void main(String[] args) {
        System.out.println();

        var keyboard = new Scanner(System.in);

        System.out.print("Please enter a numerator: ");
        double numerator = keyboard.nextDouble();

        System.out.print("Please enter a denominator: ");
        double denominator = keyboard.nextDouble();
        keyboard.close();

        if(denominator == 0) {
            System.out.printf("You cannot divide %.1f by 0.", numerator);
            System.out.println();
        } else {
            double quotient = numerator / denominator;
            System.out.printf("The quotient of %.1f and %.1f is %.1f", numerator, denominator, quotient);
            System.out.println();
        }

        System.out.println();
    }
}