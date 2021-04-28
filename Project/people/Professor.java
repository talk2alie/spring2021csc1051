package people;

import java.time.LocalDate;

public class Professor extends Person {

    private LocalDate employmentDate;

    public Professor(String firstName
                    , String middleName
                    , String lastName
                    , int villanovaNumber
                    , String birthDate
                    , String emplymentDate) {
        super(firstName, middleName, lastName, villanovaNumber, birthDate);
        this.employmentDate = LocalDate.parse(emplymentDate);
    }
    
    public String getEmplymentDate() {
        return employmentDate.toString();
    }
}
