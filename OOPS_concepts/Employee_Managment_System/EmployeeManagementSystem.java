import java.util.*;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee("E101", "Alice", 50000, 10000);
        fte.assignDepartment("Engineering");

        PartTimeEmployee pte = new PartTimeEmployee("E102", "Bob", 20000, 20, 500);
        pte.assignDepartment("Support");

        employees.add(fte);
        employees.add(pte);

        System.out.println("=== Employee Details ===");
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("---------------------------");
        }
    }
}