import java.util.ArrayList;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String deptName;

    Department(String name) {
        this.deptName = name;
    }

    void show() {
        System.out.println("Department: " + deptName);
    }
}

class University {
    String name;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void showDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department d : departments) d.show();
        System.out.println("Faculties:");
        for (Faculty f : faculties) f.show();
    }
}

public class UniversityCompositionAggregation {
    public static void main(String[] args) {
        University uni = new University("Delhi University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Physics");

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Verma");

        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showDetails();
    }
}
