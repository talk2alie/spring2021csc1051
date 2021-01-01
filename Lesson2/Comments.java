/**
 * A simple program that prints "Hello, World!" to your screen
 * 
 * This is an example of a Java Doc comment. It is used to 
 * provide description of a class or a public method
 */
public class Comments {
    /**
     * The entry point to this application
     * 
     * This another example of a Java Doc comment. This time used
     * to describe a method
     * @param args - An array of arguments to pass to the method
     * 
     * The '@param' decorator is used to describe a method parameter.
     * In this case we are using it to describe the purpose of the 
     * args parameter
     */
    public static void main(String[] args) {

        // This is a single line comment. Your comment must fit on this one line
        System.out.println ("Hello, World!");

        /*
            This is a multi-line comment. Your comment can span multiple
            lines, as long as the lines are between the multi-line comment
            symbols
        */
        System.out.println("The compiler ignores anything marked as a comment");
    }
}


