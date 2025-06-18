public class EmployeeBonusCalculator {

    // Generate salaries and years of service for 10 employees
    public static double[][] generateEmployeeData(int n) {
        double[][] data = new double[n][2]; // [salary, yearsOfService]
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000); // Salary: 5-digit
            data[i][1] = 1 + (int)(Math.random() * 10);         // Service: 1-10 years
        }
        return data;
    }

    // Calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        int n = employeeData.length;
        double[][] bonusData = new double[n][2]; // [bonus, newSalary]
        for (int i = 0; i < n; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            bonusData[i][0] = bonus;
            bonusData[i][1] = newSalary;
        }
        return bonusData;
    }

    // Display tabular result and totals
    public static void displayResults(double[][] employeeData, double[][] bonusData) {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("%-10s%-15s%-20s%-15s%-15s%n", "EmpID", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("------------------------------------------------------------------------------------");

        double totalOldSalary = 0, totalBonus = 0, totalNewSalary = 0;

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%-10d%-15.2f%-20.0f%-15.2f%-15.2f%n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("%-10s%-15.2f%-20s%-15.2f%-15.2f%n", "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
        System.out.println("------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;
        double[][] employeeData = generateEmployeeData(numberOfEmployees);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        displayResults(employeeData, bonusData);
    }
}
