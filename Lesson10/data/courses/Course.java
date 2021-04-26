package data.courses;

public class Course {
    private final int id;
    private final String name;
    private final String description;

    public Course(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%s", id, name, description);
    }
}
