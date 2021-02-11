public class FindTheBug2 {
    public static void main(String[] args) {
        System.out.println();

        // Source: Wikipedia
        float averageMaleIdentifyingHeightInUsInCm = 175.3F;

        /* Source: Wikipedia */
        float averageFemaleIdentifyingHeightInUsInCm = 164.5F;
        float difference = averageMaleIdentifyingHeightInUsInCm - averageFemaleIdentifyingHeightInUsInCm;

        System.out.println("The average height of people identifying as male in the US, according to Wikipedia, is " + averageMaleIdentifyingHeightInUsInCm + "cm");
        System.out.println("The average height of people identifying as female in the US, according to Wikipedia, is " + averageFemaleIdentifyingHeightInUsInCm + "cm");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("The difference, in height, between people identifying as men and those identifying as women is " + difference + "cm");

        System.out.println();
    }
}
