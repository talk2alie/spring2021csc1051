package people;

import java.time.LocalDate;


public abstract class Person {
    private final long id;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final LocalDate birthDate;
    private final String emailAddress;

    public Person(long id
                  , String firstName
                  , String middleName
                  , String lastName
                  , String birthDate
                  , String emailAddress) throws Exception {
        if(id < 1) {
            throw new Exception("\"id\" must be a positive number.");
        }
        this.id = id;

        this.firstName = validate("firstName", firstName);
        this.middleName = middleName == null ? "" : middleName.trim();
        this.lastName = validate("lastName", lastName);
        this.birthDate = LocalDate.parse(validate("birthDate", birthDate));
        this.emailAddress = validate("emailAddress", emailAddress);
    }

    public static String validate(String field, String value) throws Exception {
        if(value == null) {
            throw new Exception(String.format("\"%s\" must not be null.", field));
        }

        value = value.trim();
        if(value.length() == 0) {
            throw new Exception(String.format("\"%s\" must not be empty.", field));
        }

        return value;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return String.format("%s%s%s", 
                              firstName, 
                              middleName.length() == 0 ? " " : String.format(" %s ", middleName), 
                              lastName);
    }

    public String getLongBirthDate() {
        final int FIRST_CHARACTER = 0;
        final int SECOND_CHARACTER = 1;

        String month = birthDate.getMonth().name().toLowerCase();
        month = month.substring(FIRST_CHARACTER, SECOND_CHARACTER).toUpperCase() + month.substring(SECOND_CHARACTER);

        return String.format("%s %d, %d", month, birthDate.getDayOfMonth(), birthDate.getYear());
    }

    public String getShortBirthDate() {
        String month = birthDate.getMonthValue() + "";
        month = month.length() == 1 ? "0" + month : month;

        String day = birthDate.getDayOfMonth() + "";
        day = day.length() == 1 ? "0" + day : day;
        return String.format("%d-%s-%s", birthDate.getYear(), month, day);
    }

    public int getAge() {
        final int currentYear = LocalDate.now().getYear();
        final int currentMonth = LocalDate.now().getMonthValue();
        final int currentDay = LocalDate.now().getDayOfMonth();

        final int birthYear = birthDate.getYear();
        final int birthMonth = birthDate.getMonthValue();
        final int birthDay = birthDate.getDayOfMonth();

        int age = currentYear - birthYear;
        if(birthMonth > currentMonth) {
            age--;
        }

        if((birthMonth == currentMonth) && birthDay > currentDay) {
            age--;
        }

        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%s,%s,%s,%s", 
                              id,
                              firstName, 
                              middleName, 
                              lastName, 
                              getShortBirthDate(), 
                              emailAddress);
    }
 }
