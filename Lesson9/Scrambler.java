import java.util.*;

public class Scrambler {
    public static void main(String[] args) {
        System.out.println();

        var keyboard = new Scanner(System.in);
        System.out.print("Please enter text to scramble: ");
        String text = keyboard.nextLine().trim();
        keyboard.close();

        Random generator = new Random();

        final int bound = text.length();
        int counter = text.length();
        while(counter >= 0) {
            int fristIndex = generator.nextInt(bound);
            int secondIndex = generator.nextInt(bound);

            char firstCharacter = text.charAt(fristIndex);
            char secondCharacter = text.charAt(secondIndex);

            char temporary = firstCharacter;
            text = text.replace(firstCharacter, secondCharacter);
            text = text.replace(secondCharacter, temporary);

            counter--;
        }

        System.out.println(text);

        System.out.println();
    }
}
