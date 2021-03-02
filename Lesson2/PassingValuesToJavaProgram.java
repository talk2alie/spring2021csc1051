public class PassingValuesToJavaProgram {
    public static void main(String[] args) {
        
        System.out.println();

        System.out.println("Here are the values passed through the args parameter: ");
        for (String value : args) {
            System.out.println(value);
        }

        System.out.println();
    }
}
