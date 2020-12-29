public class Person {
    private String firstName;
    private String lastName;
    private String birthDate;

    public Person(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getBirthMonth() {
        if(birthDate == null) {
            return null;
        }
        String[] birthDayParts = birthDate.split("/");
        String birthMonth = birthDayParts[0];

        return birthMonth;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getFullName() {
        String fullName = firstName + " " + lastName;
        return fullName;
    }
}
