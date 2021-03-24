import java.util.Scanner;

public class PayCheck {
    public static void main(String[] args) {
        System.out.println();

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine();

        System.out.print("What is your hourly pay rate? ");
        double payRate = keyboard.nextDouble();

        System.out.print("How many hours did you work this week? ");
        double hoursWorked = keyboard.nextDouble();

        keyboard.nextLine();

        System.out.print("What is your company's name? ");
        String company = keyboard.nextLine();
        keyboard.close();

        final double taxRate = 0.27;
        double totalPay = hoursWorked * payRate;
        double taxOwed = taxRate * totalPay;
        double grossPay = totalPay - taxOwed;

        System.out.println("---------------------------------------------------------------------\n");
        System.out.println(company + " remits a weekly pay check as follows:\n");
        System.out.println("Employee:\t" + name);
        System.out.println("Hourly Rate:\t$" + payRate);
        System.out.println("Hours Worked:\t" + hoursWorked);
        System.out.println("Total Pay:\t$" + totalPay);
        System.out.println("Tax Owed:\t($" + taxOwed + ")");
        System.out.println("Gross Pay:\t$" + grossPay);
        System.out.println();
        System.out.println("---------------------------------------------------------------------\n");


        System.out.println();
    }
}
