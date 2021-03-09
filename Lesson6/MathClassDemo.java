public class MathClassDemo {
    public static void main(String[] args) {
        System.out.println();

        double radius = 4.0;
        double area = Math.PI * Math.pow(radius, 2.0);
        double roundedArea = Math.round(area);


        System.out.println("Radius: " + radius);
        System.out.println("Area: " + roundedArea);

        double a = 15;
        System.out.println(Math.cos(a));
        System.out.println();
    }
}
