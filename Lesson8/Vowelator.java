import java.util.Scanner;

public class Vowelator {
    public static void main(String[] args) {
        System.out.println();

        var keyboard = new Scanner(System.in);
        System.out.print("Please enter a vowel: ");
        char vowel = keyboard.nextLine().toUpperCase().charAt(0);
        keyboard.close();

        String vowels = "AEIOU";
        if(vowels.indexOf(vowel) < 0) {
            System.out.println("You have entered an invalid value");
        } else {
            if(vowel == 'A') {
                System.out.println("Apple");
            }
            else if(vowel == 'E') {
                System.out.println("Elephant");
            }
            else if(vowel == 'I') {
                System.out.println("India");
            }
            else if(vowel == 'O') {
                System.out.println("Oxygen");
            }
            else if(vowel == 'U') {
                System.out.println("Unicorn");
            } else {
                System.out.println("Your options are out!");
            }
        }

        System.out.println();
    }
}
