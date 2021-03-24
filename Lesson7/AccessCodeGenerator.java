import java.util.Scanner;

public class AccessCodeGenerator {
    public static void main(String[] args) {
        System.out.println();

        var keyboard = new Scanner(System.in);
        System.out.print("Please enter your first and last names, separated by a space: ");
        String memberName = keyboard.nextLine().trim();
        keyboard.close();

        final int startIndex = 0;
        int blankSpaceIndex = memberName.indexOf(" ");
        String firstName = memberName.substring(startIndex, blankSpaceIndex);
        String lastName = memberName.substring(blankSpaceIndex + 1);

        String accessCode = firstName.charAt(startIndex) + "" + lastName.charAt(startIndex);
        accessCode += firstName.length();
        accessCode += lastName.length();

        System.out.println();

        System.out.println("Hi, " + memberName + ", your access code is " + accessCode + ".");


        System.out.println();
    }
}
