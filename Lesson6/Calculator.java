public class Calculator {
    public static void main(String[] args) {
        System.out.println();

        double sum
               , product
               , difference
               , quotient
               , remainder;

        float grade1 = 92.0F * -1;
        float grade2 = 87.5F;

        sum = grade1 + grade2;
        product = grade1 * grade2;
        difference = grade1 - grade2;
        quotient = grade1 / grade2;
        remainder = grade1 % 2;


        System.out.println("The sum of " + grade1 + " and " + grade2 + " is: " + sum);
        System.out.println("The product of " + grade1 + " and " + grade2 + " is: " + product);
        System.out.println("The difference of " + grade1 + " and " + grade2 + " is: " + difference);
        System.out.println("The quotient of " + grade1 + " and " + grade2 + " is: " + quotient);
        System.out.println("The remainder of " + grade1 + " and " + 2 + " is: " + remainder);

        System.out.println();
    }
}
