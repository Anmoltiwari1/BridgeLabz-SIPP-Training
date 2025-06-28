import java.util.ArrayList;

class Subject {
    String name;
    int marks;

    Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Student {
    String name;
    ArrayList<Subject> subjects = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void addSubject(Subject subject) {
        subjects.add(subject);
    }

    ArrayList<Subject> getSubjects() {
        return subjects;
    }
}

class GradeCalculator {
    String calculateGrade(Student student) {
        int totalMarks = 0;
        for (Subject subject : student.getSubjects()) {
            totalMarks += subject.marks;
        }
        double average = totalMarks / (double) student.getSubjects().size();

        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 60) return "C";
        else return "D";
    }
}

public class SchoolResultsApplication {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.addSubject(new Subject("Maths", 90));
        student.addSubject(new Subject("Science", 85));

        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(student);

        System.out.println("Grade for " + student.name + " is: " + grade);
    }
}
