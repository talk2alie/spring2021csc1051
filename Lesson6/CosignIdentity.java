public class CosignIdentity {
    public static void main(String[] args) {
        System.out.println();

        double a = 5;
        double b = 12;
        double leftSide = Math.cos(a) + Math.cos(b);
        System.out.println("Left Side: " + leftSide);

        double rightSide = 2 * (Math.cos((0.5 * (a + b))) * (Math.cos(0.5 * (a - b))));
        System.out.println("Right Side: " + rightSide);


        System.out.println();
    }
}
