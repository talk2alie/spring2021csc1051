public class ComparingStringObjects {
    public static void main(String[] args) {
        System.out.println();

        String name = "Blake";
        String student = "blake";

        System.out.println("Is " + name + " equal to " + student + "? " + (name.equalsIgnoreCase(student) ? "Yes" : "No"));


        System.out.println();
    }
}
