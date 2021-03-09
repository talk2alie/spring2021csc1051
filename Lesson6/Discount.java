public class Discount {
    public static void main(String[] args) {
        System.out.println();

        double salePrice = 499.98;
        float discountRate = 0.45F;

        double discountAmount = salePrice * discountRate;
        double discountedPrice = salePrice - discountAmount;

        System.out.println("Sale price:\t\t$" + salePrice);
        System.out.println("Discount Rate:\t\t" + discountRate * 100 + "%");
        System.out.println("Discount Amount:\t($" + discountAmount + ")");
        System.out.println("_____________________________________________");
        System.out.println("Discounted Price:\t$" + discountedPrice);

        System.out.println();
    }
}
