// 1.
import java.util.*;
import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println();

        // 2.
        File file = new File("files\\favorite-players.csv");
        // 3.
        Scanner fileReader = new Scanner(file);

        while(fileReader.hasNext()) {
            System.out.println(fileReader.nextLine());
        }

        fileReader.close();

        System.out.println();
    }
}
