import java.text.NumberFormat;
import java.util.Locale;

/**
 * Calculates pay for a person's payroll
 */
public class Payroll2 {
    // Create a field for the employee's name
    private static String employee = "Abdulrasheed Oketona";

    public static void main(String[] args) {
        System.out.println();

        // Specify the name of an employee

        // Number of hours the employee worked
        int hoursWorked = 40;

        // Amount paid per hour
        double hourlyRate = 80.0;

        // Calculate pay
        double grossPay;
        grossPay = hoursWorked * hourlyRate;

        // Format the user's pay according to US dollars since we are in the US
        Locale usLocale = new Locale("en", "US");
        NumberFormat usFormatter = NumberFormat.getCurrencyInstance(usLocale);
        String formattedGrossPay = usFormatter.format(grossPay);

        // Print result
        System.out.printf("%s made %s this week\n", employee, formattedGrossPay);
        System.out.println();
    }
}
