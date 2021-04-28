package data.courses;

import java.time.LocalDate;

public class Enrollment {
    private final int classId;
    private final int studentId;
    private final LocalDate date;

    /**
     * Enrolls the given student to the given class, on the given date
     * @param classId - REQUIRED: valid ID for an existing class
     * @param studentId - REQUIRED: valid ID for an existing student
     * @param date - REQUIRED - enrollment date in the format; yyyy-mm-dd
     * @throws Exception - An exception is thrown when the value provided for any required field is null or an empty 
     */
    public Enrollment(int classId, int studentId, String date) throws Exception {

        if(classId < 1) {
            throw new Exception("\"classId\" must be a positive number.");
        }

        if(studentId < 1) {
            throw new Exception("\"studentId\" must be a positive number.");
        }

        if(date == null) {
            throw new Exception("\"date\" must not be null");
        }

        this.classId = classId;
        this.studentId = studentId;
        this.date = LocalDate.parse(date);
    }

    public int getClassId() {
        return classId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getLongDate() {
        final int FIRST_CHARACTER = 0;
        final int SECOND_CHARACTER = 1;

        String month = date.getMonth().name().toLowerCase();
        month = month.substring(FIRST_CHARACTER, SECOND_CHARACTER).toUpperCase() + month.substring(SECOND_CHARACTER);

        return String.format("%s %d, %d", month, date.getDayOfMonth(), date.getYear());
    }

    public String getShortDate() {
        String month = date.getMonthValue() + "";
        month = month.length() == 1 ? "0" + month : month;

        String day = date.getDayOfMonth() + "";
        day = day.length() == 1 ? "0" + day : day;
        return String.format("%d-%s-%s", date.getYear(), month, day);
    }

    @Override
    public String toString() {
        return String.format("%d,%d,%s", classId, studentId, getShortDate());
    }
}
