import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(Employee emp) {
        employees.add(emp);
    }

    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void showDetails() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }
}

public class CompanyComposition {
    public static void main(String[] args) {
        Company company = new Company("Tech Corp");

        Department dept1 = new Department("IT");
        dept1.addEmployee(new Employee("John"));
        dept1.addEmployee(new Employee("Jane"));

        Department dept2 = new Department("HR");
        dept2.addEmployee(new Employee("Alice"));

        company.addDepartment(dept1);
        company.addDepartment(dept2);

        company.showDetails();
    }
}
