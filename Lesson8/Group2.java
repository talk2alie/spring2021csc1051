import java.util.Scanner;

public class Group2 {
    public static void main(String[] args) {
        System.out.println();

        var keyboard = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        byte age = keyboard.nextByte();
        keyboard.close();

        if(age < 16) {
            System.out.println("You are in the Kid's club");
        } else if(age >= 17 && age <= 20) {
            System.out.println("You are in the Early Bird's club");
        } else if(age >= 21) {
            System.out.println("You are in the Grown-up's club");
            if(age >= 55) {
                System.out.println("You are in the Retiree club");
            }
        }


        System.out.println();
    }
}
