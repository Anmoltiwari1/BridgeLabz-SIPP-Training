import java.util.ArrayList;

class Course {
    String courseName;

    Course(String name) {
        this.courseName = name;
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course course) {
        courses.add(course);
    }

    void showCourses() {
        System.out.println(name + "'s Courses:");
        for (Course c : courses) {
            System.out.println(c.courseName);
        }
    }
}

class School {
    String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    School(String name) {
        this.schoolName = name;
    }

    void addStudent(Student student) {
        students.add(student);
    }
}

public class SchoolAssociationAggregation {
    public static void main(String[] args) {
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        Student s1 = new Student("Anmol");
        Student s2 = new Student("Rahul");

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        School school = new School("GLA University");
        school.addStudent(s1);
        school.addStudent(s2);

        s1.showCourses();
        s2.showCourses();
    }
}
