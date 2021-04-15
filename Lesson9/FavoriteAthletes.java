import java.util.Scanner;

// Step 1. for writing to file
import java.io.*;


public class FavoriteAthletes {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println();

        var keyboard = new Scanner(System.in);

        // Step 2
        var printWriter = new PrintWriter("files/favorite-players.csv");
        String isComplete = "no";

        // Step 3
        printWriter.printf("%-20s,%-25s\n", "Favorite Sport", "Favorite Player");

        do {
            System.out.print("What is a favorite sport of yours? ");
            String favoriteSport = keyboard.nextLine();

            System.out.printf("Who is your favorite player in %s? ", favoriteSport);
            String favoritePlayer = keyboard.nextLine();

            printWriter.printf("%-20s,%-25s\n", favoriteSport, favoritePlayer);

            System.out.print("Is your favorites list complete? ");
            isComplete = keyboard.nextLine().trim();

        } while(isComplete.equalsIgnoreCase("no"));

        // Step 4
        printWriter.close();
        keyboard.close();

        System.out.println();
    }
}
