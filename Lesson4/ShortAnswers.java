/**
 * A simple class that tests your ability to 
 * identify parts of a Java program
 */
public class ShortAnswers {
    public static void main(String[] args) {
        System.out.println();

        // Create a variable to hold the total characters
        int totalCharactersInNames = 0;

        int countOfChractersInFirstName;
        int countOfChractersInSecondName;

        String firstName = "Madden, Thomas A.";
        countOfChractersInFirstName = firstName.length();

        String secondName = "Walsh, Abigail G.";
        countOfChractersInSecondName = secondName.length();

        /*
         * The following is an arithmetic operation with which you should be familiar
         */
        totalCharactersInNames = countOfChractersInFirstName + countOfChractersInSecondName;
        System.out.println("Our 2 names contain a total character count of " + totalCharactersInNames);

        System.out.println();
    }
}



