import java.util.Scanner;

public class Scrambler {
    public static void main(String[] args) {
        System.out.println();

        var keyboard = new Scanner(System.in);

        System.out.print("Please enter a random text: ");
        String text = keyboard.nextLine();

        System.out.print("Please enter a character from your previous random text: ");
        char scramblingCharacter = keyboard.nextLine().charAt(0);

        char lastCharacter = text.charAt(text.length() - 1);
        String scrambledText = text.replace(scramblingCharacter, lastCharacter);
        System.out.println();
        System.out.println("Your scrmabled text is:");
        System.out.println("\"" + scrambledText + "\"");

        keyboard.close();

        System.out.println();
    }
}
