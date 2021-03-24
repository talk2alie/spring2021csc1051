import java.util.Scanner;

public class PayCheckSolution {
    public static void main(String[] args) {
        System.out.println();

        var keyboard = new Scanner(System.in);

        // 1.
        System.out.print("Please enter your pay rate per hour: ");
        double payRate = keyboard.nextDouble();

        // 2. 
        System.out.print("Please enter your hours worked this week: ");
        double hoursWorked = keyboard.nextDouble();

        keyboard.nextLine();
        // 3. 
        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine();
        keyboard.close();

        // 4. 
        double totalPay = hoursWorked * payRate;

        // 5. 
        final double taxRate = 0.21;
        double taxOwed = totalPay * taxRate;

        // 6. 
        double grossPay = totalPay - taxOwed;

        System.out.println("----------------------------------------------------------");
        System.out.println("Employee:\t\t" + name);
        System.out.println("Hours Worked:\t\t" + hoursWorked);
        System.out.println("Pay Rate per Hour:\t" + payRate);
        System.out.println();
        System.out.println("Total Pay:\t\t" + totalPay);
        System.out.println("Taxes and Benefits:\t-" + taxOwed);
        System.out.println("Gross Pay:\t\t" + grossPay);
        System.out.println("----------------------------------------------------------");

        System.out.println();
    }
}
