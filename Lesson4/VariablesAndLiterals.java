/**
 * A simple program to demonstrate the use of variables and literals
 */
public class VariablesAndLiterals {
    public static void main(String[] args) {
        System.out.println();

        String studentName;

        studentName = "Bettendorf, Shelby M.";

        
        System.out.println(24);
        System.out.println(true);
        
        System.out.println("-------------------------------------------------------");
        int numberOfStudents = 28;
        System.out.println("Spring 2021 CSC 1051, Section 003, has " + numberOfStudents + " students.");
        System.out.println(studentName + " is one of those " + numberOfStudents + " students.");
        System.out.println(studentName + " is planning on acing this course!");
        System.out.println("-------------------------------------------------------");

        float fingersCount;
        fingersCount = 20 + 25.4f - 38;
        System.out.println(fingersCount);

        fingersCount = 55;
        System.out.println(fingersCount);
    }
}
