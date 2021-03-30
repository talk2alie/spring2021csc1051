import java.util.Scanner;

/**
 * Group1Question1
 */
public class Group1 {

    public static void main(String[] args) {
        System.out.println();

        /*
         1. Write a program that asks a user for her age. Print out the following message if the user's age falls in the following range:
        a. Age range: 9 to 24 -> "You are a Generation Z"
        b. Age range: 25 to 39 -> "You are a Millennial"
        c. Age range: 40 to 54 -> "You are a Generation X"
        d. Age range: 55 to 69 -> "You are a Boomer"
        e. Age range: 70 to 84 -> "You are a Silent"
         */

         var keyboard = new Scanner(System.in);
         System.out.print("Please enter your age: ");
         byte age = keyboard.nextByte();
         keyboard.close();

         String message = "You are a ";

         if(age >= 9 && age <= 24) {
             message += "Generation Z";
         } else if(age >= 25 && age <= 39) {
             message += "Millenial";
         } else if(age >= 40 && age <= 54) {
             message += "Generation X";
         } else if(age >= 55 && age <= 69) {
             message += "Boomer";
         } else if(age >= 70 && age <= 84) {
             message += "Silent";
         }
         System.out.println(message);


        System.out.println();
    }
}