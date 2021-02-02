/**
 * A simple program that shows how to declare and use variables
 */
public class VariableDeclaration {
    public static void main(String[] args) {
        System.out.println();

        // Declare variables
        int age;
        short distanceInMiles;
        int capacity;
        long annualCapacity;

        short birthYear = 1983;
        short currentYear = 2021;
        age = currentYear - birthYear;

        double distanceFromEarthToTheMoonInMiles, 
               distanceFromEarthToMarsInMiles, 
               distanceFromEarthToJupiterInMiles;

        byte chairsAvailbe;
        chairsAvailbe = 28;

        short stadiumAttendees;
        stadiumAttendees = 32_678;

        int numberOfStudents;
        numberOfStudents = 28;

        long starsCountedSoFar;
        starsCountedSoFar = 28L;
        
        // Assign values to variables
        age = 12;
        distanceInMiles = 2583;
        capacity = 98586;
        annualCapacity = capacity * 12;
        
        System.out.println("We traveled over " + distanceInMiles + " miles to visit the Machester United Stadium.");
        System.out.println("It was crowded with over " + capacity + " people. The stadium actually receives up to " );
        System.out.println(annualCapacity + " visitors a year. The average age of its visitors is " + age + ".");
        
        System.out.println();
    }
}

