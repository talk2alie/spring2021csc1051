/**
 * A simple program that demonstrates the difference between whole numbers 
 * and Floating-point numbers
 */
public class FloatingPointNumbers {
    public static void main(String[] args) {
        System.out.println();

        float pi;
        // pi = 3.14F;
        // System.out.println(pi);

        // double heightInInches;
        // heightInInches = pi;

        pi = 1_200L;

        long capacity = 23_000L;
        int smallCapacity = (int)capacity;

        // Step 1
        pi = 3.14F;
        int unit = 0;

        unit = (int)pi;

        System.out.println("PI is float and should have decimal places");
        System.out.println(pi);
        System.out.println("Unit is int and it should not have decimal places");
        System.out.println(unit);
    }
}
