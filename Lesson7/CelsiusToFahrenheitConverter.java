import java.util.Scanner;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        System.out.println();

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.print("Please enter temperature in degree celsius: ");
        double temperatureInCelsius = keyboard.nextDouble();

        /*
            f = c (9/5) + 32
        */
        double temperatureInFahrenheit = ((temperatureInCelsius * 9) / 5) + 32;

        System.out.println(temperatureInCelsius + " degree Celsius is " + temperatureInFahrenheit + " degree Fahrenheit.");

        keyboard.close();
        System.out.println();
    }
}
