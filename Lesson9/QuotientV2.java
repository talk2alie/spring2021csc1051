import java.util.Scanner;


public class QuotientV2 {
    public static void main(String[] args) {
        System.out.println();


        var keyboard = new Scanner(System.in);

        System.out.print("Please enter numerator: ");
        double numerator = keyboard.nextDouble();

        System.out.print("Please enter denominator: ");
        double denominator = keyboard.nextDouble();

        while(denominator == 0.0) {
            System.out.print("Please enter denominator: ");
            denominator = keyboard.nextDouble();
        }

        keyboard.close();

        double quotient = numerator / denominator;
        System.out.println(quotient);

        System.out.println();
    }
}
