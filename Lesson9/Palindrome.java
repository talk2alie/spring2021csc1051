import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println();

        var keyboard = new Scanner(System.in);
        System.out.print("Please enter your word: ");
        String word = keyboard.nextLine().trim();
        keyboard.close();

        if(word.length() == 0 || word.length() == 1) {
            System.out.println("It's a palindrome!");
        } else {
            int frontIndex = 0;
            int backIndex = word.length() - 1;
            char frontCharacter = word.charAt(frontIndex);
            char backCharacter = word.charAt(backIndex);
            while(frontIndex < backIndex && frontCharacter == backCharacter) {
                frontIndex++;
                backIndex--;
                frontCharacter = word.charAt(frontIndex);
                backCharacter = word.charAt(backIndex);
                if(frontCharacter != backCharacter) {
                    break;
                }
            }

            if(frontCharacter == backCharacter) {
                System.out.println("It's a palindrome!");
            }
            else {
                System.out.println("It's not a palindrome!");
            }

            
        }

        System.out.println();
    }
}
