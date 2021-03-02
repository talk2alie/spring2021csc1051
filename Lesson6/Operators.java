/**
 * Operators
 */
public class Operators {
    public static void main(String[] args) {
        System.out.println();

        int amount, total, price = 15, tax = 5, number = 2;
        amount = 4 + 8;          // + adds 4 and 8 and = assigns 12 to amount
        total = price + tax;     // + adds the values in price and tax and = assigns the sum to total
        number = number + 1;     // + adds the value in number to 1 and = assigns the sum to number

        double cost = 15.99;
        // double tax = 0.06;
        double totalPrice = cost + tax;
        System.out.println(totalPrice);

        int currentYear = 2021;
        int birthYear = 1983;
        int age = currentYear - birthYear;

        int temperature, sale, discount = 12;
        temperature = 112 - 14;     // - subtracts 14 from 112 and = assigns the difference to temperature
        sale = price - discount;    // - subtracts discount from price and = assigns the difference to sale
        number = number - 1;        // - subtracts 1 from number and = assigns the difference to number

        double salePrice = 50, taxRate = 0.06;
        double dimension = 45 * 19.2;         // * multiplies 45 by 19.2 and = assigns the product to dimension
        double saleTax = salePrice * taxRate; // * multiplies salePrice by taxRate and = assigns the product to saleTax

        System.out.println(dimension + salePrice + saleTax);

        int maxAllowed = 11, players = 222;
        double points, teams, half;

        points = 100/20;            /* / divides 100 by 20 and = assigns the quotient to points*/
        teams = players/maxAllowed; /* / divides players by maximumPlayersAllowed and = assigns the quotient to teams */
        half = number/2;            /* / divides number by 2 and = assigns the quotient to half*/

        int leftOver = 17 % 3;  // % divides 17 by 3 and = assigns the remainder to leftOver
        double a = 9 % 3;
        System.out.println("a is " + a);

        short accounts = 100 + 39;

        double result;
        result = 5.0 / 2;
        System.out.println(result);

    }
}