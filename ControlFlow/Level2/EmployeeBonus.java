import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        double[] salaries = new double[10];
        double[] years = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Years of Service: ");
            double year = sc.nextDouble();

            if (salary <= 0 || year < 0) {
                System.out.println("Invalid input. Try again.");
                i--; // retry this employee
                continue;
            }

            salaries[i] = salary;
            years[i] = year;

            // Calculate bonus
            if (year > 5) {
                bonuses[i] = 0.05 * salary;
            } else {
                bonuses[i] = 0.02 * salary;
            }

            newSalaries[i] = salary + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salary;
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\n--- Employee Bonus Summary ---");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.printf("\nTotal Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

        sc.close();
    }
}
