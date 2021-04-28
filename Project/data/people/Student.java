package data.people;

public class Student extends Person {

    private String major;
    private String minor;

    /**
     * Creates an instance of a student with their given details
     * @param id - REQUIRED: the student's university issued ID number
     * @param firstName - REQUIRED: the student's first name
     * @param middleName - OPTIONAL: the student's middle name. You must specify "null" if they have no middle name
     * @param lastName - REQUIRED: the student's last name
     * @param birthDate - REQUIRED: the student's date of birth in the format; yyyy-mm-dd
     * @param emailAddress - REQUIRED: the student's email address
     * @throws Exception - An exception is thrown when the value provided for any required field is null or an empty string
     */
    public Student(int id
                   , String firstName
                   , String middleName
                   , String lastName
                   , String birthDate
                   , String emailAddress) throws Exception {
        super(id, firstName, middleName, lastName, birthDate, emailAddress);
        major = minor = "";
    }

    /**
     * Changes the student's major to the new major given
     * @param newMajor - REQUIRED: the student's new preferred major
     * @throws Exception - An exception is thrown when the value provided for the new major is null or empty
     */
    public void setMajor(String newMajor) throws Exception {
        newMajor = Person.validate("major", newMajor);
        major = newMajor;
    }

    public String getMajor() {
        return major;
    }

    /**
     * Changes the student's minor to the new minor given
     * @param newMinor - REQUIRED: The student's new preferred minor
     * @throws Exception - An exception is thrown when the value provided for the new minor is null or empty
     */
    public void setMinor(String newMinor) throws Exception {
        newMinor = Person.validate("minor", newMinor);
        minor = newMinor;
    }

    public String getMinor() {
        return minor;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s", super.toString(), major, minor);
    }
}
