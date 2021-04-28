package data;

import java.io.*;
import java.util.*;

import data.courses.*;
import data.courses.Class;
import data.people.*;

public class SchoolDbContext {
    private final 
            // People
            int PERSON_ID = 0
            , FIRST_NAME = 1
            , MIDDLE_NAME = 2
            , LAST_NAME = 3
            , BIRTH_DATE = 4
            , EMAIL_ADDRESS = 5
            , MAJOR = 6
            , MINOR = 7
            
            // Enrollment
            , ENROLLMENT_ID = 0
            , STUDENT_ID = 1
            , ENROLLMENT_DATE = 2
            
            // Course
            , COURSE_ID = 0
            , NAME = 1
            , DESCRIPTION = 2
            
            // Class
            , CLASS_ID = 0
            , R_COURSE_ID = 1
            , PROFESSOR_ID = 2
            , DAYS = 3
            , START_TIME = 4
            , END_TIME = 5
            , LOCATION = 6;

    private final String CLASS_FILE_NAME = "data/classes.csv"
                         , COURSE_FILE_NAME = "data/courses.csv"
                         , ENROLLMENT_FILE_NAME = "data/enrollments.csv"
                         , PROFESSOR_FILE_NAME = "data/professors.csv"
                         , STUDENT_FILE_NAME = "data/students.csv";

    private final boolean APPEND = true;

    private final ArrayList<Class> classes;
    private final ArrayList<Course> courses;
    private final ArrayList<Enrollment> enrollments;
    private final ArrayList<Professor> professors;
    private final ArrayList<Student> students;

    private PrintWriter 
            classWriter
            , courseWriter
            , enrollmentWriter
            , professorWriter
            , studentWriter;

    public SchoolDbContext() throws Exception {
        classes = new ArrayList<>();
        courses = new ArrayList<>();
        enrollments = new ArrayList<>();
        professors = new ArrayList<>();
        students = new ArrayList<>();

        loadClasses();
        loadCourses();
        loadEnrollments();
        loadProfessors();
        loadStudents();
    }

    private void loadStudents() throws Exception {
        var students = new File(STUDENT_FILE_NAME);
        var reader = new Scanner(students);
        while(reader.hasNextLine()) {
            var line = reader.nextLine();
            if(line.startsWith("Id")) {
                continue;
            }

            var tokens = line.split(",");
            var student = new Student(Integer.parseInt(tokens[PERSON_ID])
                                      , tokens[FIRST_NAME]
                                      , tokens[MIDDLE_NAME]
                                      , tokens[LAST_NAME]
                                      , tokens[BIRTH_DATE]
                                      , tokens[EMAIL_ADDRESS]);
            if(tokens.length > MAJOR) {
                var major = tokens[MAJOR];
                if(major != null && major.length() > 0) {
                    student.setMajor(major);
                }
            }

            if(tokens.length > MINOR) {
                var minor = tokens[MINOR];
                if(minor != null && minor.length() > 0) {
                    student.setMinor(minor);
                }
            }
            
            this.students.add(student.getId() - 1, student);            
        }

        reader.close();
    }

    private void loadProfessors() throws Exception {
        var professors = new File(PROFESSOR_FILE_NAME);
        var reader = new Scanner(professors);
        while(reader.hasNextLine()) {
            var line = reader.nextLine();
            if(line.startsWith("Id")) {
                continue;
            }

            var tokens = line.split(",");
            var professor = new Professor(Integer.parseInt(tokens[PERSON_ID])
                                      , tokens[FIRST_NAME]
                                      , tokens[MIDDLE_NAME]
                                      , tokens[LAST_NAME]
                                      , tokens[BIRTH_DATE]
                                      , tokens[EMAIL_ADDRESS]);         
            
            this.professors.add(professor.getId() - 1, professor);            
        }

        reader.close();
        reader = null;
    }

    private void loadEnrollments() throws Exception {
        var enrollments = new File(ENROLLMENT_FILE_NAME);
        var reader = new Scanner(enrollments);
        while(reader.hasNextLine()) {
            var line = reader.nextLine();
            if(line.startsWith("ClassId")) {
                continue;
            }

            var tokens = line.split(",");
            var enrollment = new Enrollment(Integer.parseInt(tokens[ENROLLMENT_ID])
                                      , Integer.parseInt(tokens[STUDENT_ID])
                                      , tokens[ENROLLMENT_DATE]);         
            
            this.enrollments.add(enrollment.getStudentId() - 1, enrollment);            
        }

        reader.close();
        reader = null;
    }

    private void loadCourses() throws Exception {
        var courses = new File(COURSE_FILE_NAME);
        var reader = new Scanner(courses);
        while(reader.hasNextLine()) {
            var line = reader.nextLine();
            if(line.startsWith("Id")) {
                continue;
            }

            var tokens = line.split(",");
            var course = new Course(Integer.parseInt(tokens[COURSE_ID])
                                      , tokens[NAME]
                                      , tokens[DESCRIPTION]);         
            
            this.courses.add(course.getId() - 1, course);            
        }

        reader.close();
        reader = null;
    }

    private void loadClasses() throws Exception {
        var classes = new File(CLASS_FILE_NAME);
        var reader = new Scanner(classes);
        while(reader.hasNextLine()) {
            var line = reader.nextLine();
            if(line.startsWith("Id")) {
                continue;
            }

            var tokens = line.split(",");
            var currentClass = new Class(Integer.parseInt(tokens[CLASS_ID])
                                         , Integer.parseInt(tokens[R_COURSE_ID])
                                         , Integer.parseInt(tokens[PROFESSOR_ID])
                                         , tokens[DAYS]
                                         , tokens[START_TIME]
                                         , tokens[END_TIME]
                                         , tokens[LOCATION]);         
            
            this.classes.add(currentClass.getId() - 1, currentClass);            
        }

        reader.close();
        reader = null;
    }

    public void add(Course course) throws IOException {
        courses.add(course.getId() - 1, course);

        if(courseWriter == null) {
            var fileWriter = new FileWriter(COURSE_FILE_NAME, APPEND);
            courseWriter = new PrintWriter(fileWriter);
        }

        courseWriter.println(course.toString());
    }

    public void addAllCourses(List<Course> courses) throws IOException {
        for (Course course : courses) {
            add(course);
        }
    }
    
    public List<Course> getCourses() {
        return new ArrayList<Course>(courses);
    }
    
    public Course getCourseWithId(int id) {
        return courses.get(id - 1);
    }
    
    public void add(Class newClass) throws IOException {
        classes.add(newClass);
        
        if(classWriter == null) {
            var fileWriter = new FileWriter(CLASS_FILE_NAME, APPEND);
            classWriter = new PrintWriter(fileWriter);
        }
        
        classWriter.println(newClass.toString());
    }

    public void addAllClasses(List<Class> classes) throws IOException {
        for (Class newClass : classes) {
            add(newClass);
        }
    }

    public List<Class> getClasses() {
        return classes;
    }

    public Class getClassWithId(int id) {
        return classes.get(id - 1);
    }

    public void add(Enrollment enrollment) throws IOException {
        enrollments.add(enrollment.getStudentId() - 1, enrollment);

        if(enrollmentWriter == null) {
            var fileWriter = new FileWriter(ENROLLMENT_FILE_NAME, APPEND);
            enrollmentWriter = new PrintWriter(fileWriter);
        }

        enrollmentWriter.println(enrollment.toString());
    }

    public void addAllEnrollments(List<Enrollment> enrollments) throws IOException {
        for (Enrollment enrollment : enrollments) {
            add(enrollment);
        }
    }

    public List<Enrollment> getEnrollmentsForStudentId(int studentId) {
        var studentEnrollments = new ArrayList<Enrollment>();
        for (Enrollment enrollment : enrollments) {
            if(enrollment.getStudentId() == studentId) {
                studentEnrollments.add(enrollment);
            }
        }

        return enrollments;
    }

    public void add(Professor professor) throws IOException {
        professors.add(professor.getId() - 1, professor);

        if(professorWriter == null) {
            var fileWriter = new FileWriter(PROFESSOR_FILE_NAME, APPEND);
            professorWriter = new PrintWriter(fileWriter);
        }

        professorWriter.println(professor.toString());
    }

    public void addAllProfessors(List<Professor> professors) throws IOException {
        for (Professor professor : professors) {
            add(professor);
        }
    }

    public Professor getProfessorWithId(int id) {
        return professors.get(id - 1);
    }

    public void add(Student student) throws IOException {
        students.add(student.getId() - 1, student);

        if(studentWriter == null) {
            var fileWriter = new FileWriter(STUDENT_FILE_NAME, APPEND);
            studentWriter = new PrintWriter(fileWriter);
        }

        studentWriter.println(student.toString());
    }

    public void allAllStudents(List<Student> students) throws IOException {
        for (Student student : students) {
            add(student);
        }
    }

    public Student getStudentWithId(int id) {
        return students.get(id - 1);
    }

    public void saveChanges() {
        if(classWriter != null) {
            classWriter.close();
            classWriter = null;
        }

        if(courseWriter != null) {
            courseWriter.close();
            courseWriter = null;
        }

        if(enrollmentWriter != null) {
            enrollmentWriter.close();
            enrollmentWriter = null;
        }

        if(professorWriter != null) {
            professorWriter.close();
            professorWriter = null;
        }

        if(studentWriter != null) {
            studentWriter.close();
            studentWriter = null;
        }
    }
}
