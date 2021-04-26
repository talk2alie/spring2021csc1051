package data;

import java.io.*;
import java.util.*;

import data.courses.*;
import data.courses.Class;
import data.people.*;

public class SchoolDbContext {
    private final 
            // People
            int ID = 0
            , FIRST_NAME = 1
            , MIDDLE_NAME = 2
            , LAST_NAME = 3
            , BIRTH_DATE = 4
            , EMAIL_ADDRESS = 5
            , MAJOR = 6
            , MINOR = 7
            
            // Enrollment
            , CLASS_ID = 0
            , STUDENT_ID = 1
            , ENROLLMENT_DATE = 2;

    private final ArrayList<Class> classes;
    private final ArrayList<Course> courses;
    private final ArrayList<Enrollment> enrollments;
    private final ArrayList<Professor> professors;
    private final ArrayList<Student> students;

    private Scanner reader;
    private PrintWriter writer;

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
        var students = new File("data/students.csv");
        reader = new Scanner(students);
        while(reader.hasNextLine()) {
            var line = reader.nextLine();
            if(line.startsWith("Id")) {
                continue;
            }

            var tokens = line.split(",");
            var student = new Student(Integer.parseInt(tokens[ID])
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
        reader = null;
    }

    private void loadProfessors() throws Exception {
        var professors = new File("data/professors.csv");
        reader = new Scanner(professors);
        while(reader.hasNextLine()) {
            var line = reader.nextLine();
            if(line.startsWith("Id")) {
                continue;
            }

            var tokens = line.split(",");
            var professor = new Professor(Integer.parseInt(tokens[ID])
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
        var enrollments = new File("data/enrollments.csv");
        reader = new Scanner(enrollments);
        while(reader.hasNextLine()) {
            var line = reader.nextLine();
            if(line.startsWith("ClassId")) {
                continue;
            }

            var tokens = line.split(",");
            var enrollment = new Enrollment(Integer.parseInt(tokens[CLASS_ID])
                                      , Integer.parseInt(tokens[STUDENT_ID])
                                      , tokens[ENROLLMENT_DATE]);         
            
            this.enrollments.add(enrollment.getStudentId() - 1, enrollment);            
        }

        reader.close();
        reader = null;
    }

    private void loadCourses() {

    }

    private void loadClasses() {

    }

    public void saveChanges() {
        if(writer != null) {
            writer.flush();
            writer.close();
            writer = null;
        }
    }
}
