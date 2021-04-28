package data.people;

public class Professor extends Person {

    /**
     * Creates an instance of a professor with their given details
     * @param id - REQUIRED: the professor's university issued ID number
     * @param firstName - REQUIRED: the professor's first name
     * @param middleName - OPTIONAL: the professor's middle name. You must specify "null" if they have no middle name
     * @param lastName - REQUIRED: the professor's last name
     * @param birthDate - REQUIRED: the professor's date of birth in the format; yyyy-mm-dd
     * @param emailAddress - REQUIRED: the professor's email address
     * @throws Exception - An exception is thrown if the value provided for any required field is null or an empty string
     */
    public Professor(int id, String firstName, String middleName, String lastName, String birthDate,
            String emailAddress) throws Exception {
        super(id, firstName, middleName, lastName, birthDate, emailAddress);
    }    
}
