public class Conversion {
    public static void main(String[] args) {
        System.out.println();

        // Java checks for data type compatibility

        int players = 58;


        int capacity = players;

        byte red = 120;
        int mixture = red;

        int numberOfPackets = 12;
        double pricePerPacket = 4.99;
        double subtotal = numberOfPackets * pricePerPacket;


        int finale = (int)22.5F;
        System.out.println("The finale variable will hold the whole number part of the float literal. " + finale);

        int leftOperand = 5;
        int rightOperand = 2;
        System.out.println((double)(leftOperand / rightOperand));
    }
}
