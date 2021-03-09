public class LargeToSmallConversion {
    public static void main(String[] args) {
        System.out.println();

        byte age = 105;
        int population = 0;

        population = 256;
        age = (byte)population;

        System.out.println("Age: " + age);
        System.out.println("Population: " + population);

        System.out.println();
    }
}
