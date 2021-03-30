import java.util.Scanner;

public class Vowelator2 {
    public static void main(String[] args) {
        System.out.println();

        var keyboard = new Scanner(System.in);
        System.out.print("Please enter a vowel: ");
        char vowel = keyboard.nextLine().toUpperCase().charAt(0);
        keyboard.close();

        switch(vowel) {
            case 'A':
                System.out.println("Apple");
                break;
            case 'E':
                System.out.println("Elephant");
                break;
            case 'I':
                System.out.println("India");
            case 'O':
                System.out.println("Oxygen");
                break;
            case 'U':
                System.out.println("Unicorn");
                break;
            default:
                System.out.println("You have entered an invalid value");
        }

        System.out.println();
    }
}
