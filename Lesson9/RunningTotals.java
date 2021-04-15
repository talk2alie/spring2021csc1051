import java.util.Scanner;

public class RunningTotals {
    public static void main(String[] args) {
        System.out.println();

        var keyboard = new Scanner(System.in);
        double totalSale = 0.0;
        double currentSale = 0.0;

        do {
            totalSale += currentSale;
            System.out.println();
            System.out.print("Please enter sale. Enter a negative sale when you are done: ");
            currentSale = keyboard.nextDouble();
        } while(currentSale >= 0.0);

        keyboard.close();
        System.out.println(totalSale);

        System.out.println();
    }
}
