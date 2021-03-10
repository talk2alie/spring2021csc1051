public class NamedConstant {
    public static void main(String[] args) {
        System.out.println();


        String name;
        name = "Allison";

        // final byte NUMBER_OF_STUDENTS = 28;
        // System.out.println("There are " + NUMBER_OF_STUDENTS + " students in this class. " +
        //                    "Hopefully, by the end of the semester, " +
        //                    "there will be " + NUMBER_OF_STUDENTS + " students. If there " +
        //                    "aren't " + NUMBER_OF_STUDENTS + " students, I hope the ones who " +
        //                    "dropped out, had some fun.");

        final byte STUDENT_COUNT = 28;
        System.out.println("There are " + STUDENT_COUNT + " students in this class");
        System.out.println("The " + STUDENT_COUNT + " students I have are doing really well.");
        System.out.println("My " + STUDENT_COUNT + " students rock!");

        System.out.println();
    }
}
