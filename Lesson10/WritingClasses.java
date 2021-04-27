import people.Person;
import people.Professor;

public class WritingClasses {
    public static void main(String[] args) {
        System.out.println();

        // yyyy-mm-dd
        Person person = new Person("Allison", "A", "Blake", 12345, "1985-01-13");
        System.out.println(person);

        var professor = new Professor("Allison", "A", "Blake", 12345, "1985-01-13", "2020-08-16");

        System.out.println();
    }
}
