package domain;

public class Section {
    private final String course;
    private final String number;
    private final String days;
    private final String startTime;
    private final String endTime;
    private final String location;
    private final String professor;

    public Section(String course
                   , String number
                   , String days
                   , String startTime
                   , String endTime
                   , String location
                   , String professor) {
        this.course = course;
        this.number = number;
        this.days = days;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.professor = professor;
    }

    public void print() {
        System.out.printf("%s - Section %s\n", course, number);
        System.out.println("----------------------------------------------------------");
        System.out.printf("Days: %s; from %s to %s | Location: %s\n", days, startTime, endTime, location);
        System.out.printf("Professor: %s", professor);
    }
}
