package courses;

public class Class {
    private final int id;
    private final int courseId;
    private final long professorId;
    private final String days;
    private final String startTime;
    private final String endTime;
    private final String location;
    
    public Class(int id
                 , int courseId
                 , long professorId
                 , String days
                 , String startTime
                 , String endTime
                 , String location) {
        this.id = id;
        this.courseId = courseId;
        this.professorId = professorId;
        this.days = days;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public int getCourseId() {
        return courseId;
    }

    public long getProfessorId() {
        return professorId;
    }

    public String getDays() {
        return days;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return String.format("%d,%d,%d,%s,%s,%s,%s",
                              id
                              , courseId
                              , professorId
                              , days
                              , startTime
                              , endTime
                              , location);
    }
}
