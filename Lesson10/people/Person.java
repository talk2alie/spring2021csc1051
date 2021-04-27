package people;

import java.time.LocalDate;

/**
 * Person
 */
public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private final int villanovaNumber;
    private final LocalDate birthDate;

    public Person(String firstName, String middleName, String lastName, int villanovaNumber, String birthDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.villanovaNumber = villanovaNumber;
        this.birthDate = LocalDate.parse(birthDate);
    }    

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getVillanovaNumber() {
        return villanovaNumber;
    }

    public int getAge() {
        LocalDate todaysDate = LocalDate.now();
        int currentYear = todaysDate.getYear();

        int age = currentYear - birthDate.getYear();
        return age;
    }

    public String getFullName() {
        return String.format("%s%s%s", firstName, middleName == null ? " " : " " + middleName + " ", lastName);
    }

    public String getBirthDay() {
        return String.format("%s %d", birthDate.getMonth().name(), birthDate.getDayOfMonth());
    }

    @Override
    public String toString() {
        return getFullName();
    }
}