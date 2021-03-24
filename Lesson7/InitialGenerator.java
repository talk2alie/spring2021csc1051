import java.util.Scanner;

public class InitialGenerator {
    public static void main(String[] args) {
        System.out.println();

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your first and last name, separated by a single space: ");
        String userName = keyboard.nextLine();
        keyboard.close();

        final String space = " ";
        int spaceIndex = userName.indexOf(space);
        final int startIndex = 0;
        String firstName = userName.substring(startIndex, spaceIndex);
        String lastName = userName.substring(spaceIndex + 1);

        String initial = firstName.charAt(startIndex) + "" + lastName.charAt(startIndex);
        System.out.println("Hi, " + userName + ".\nYour initial is " + initial + ".");

        System.out.println();
    }
}
