import java.util.ArrayList;

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Course c) {
        System.out.println(name + " assigned to teach: " + c.courseName);
    }
}

class StudentU {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    StudentU(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        courses.add(c);
        System.out.println(name + " enrolled in: " + c.courseName);
    }
}

class Course {
    String courseName;

    Course(String name) {
        this.courseName = name;
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming");
        Course c2 = new Course("DBMS");

        StudentU student = new StudentU("Anmol");
        student.enrollCourse(c1);
        student.enrollCourse(c2);

        Professor prof = new Professor("Dr. Kumar");
        prof.assignCourse(c1);
    }
}
