import java.util.Scanner;

public class TeamBMIReport {

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static String[][] calculateBMI(double[][] hwData) {
        String[][] result = new String[hwData.length][4];
        for (int i = 0; i < hwData.length; i++) {
            double weight = hwData[i][0];
            double heightCm = hwData[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            result[i][0] = String.format("%.1f", heightCm);
            result[i][1] = String.format("%.1f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getStatus(bmi);
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (String[] row : data) {
            System.out.printf("%s\t\t%s\t\t%s\t%s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hwData = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter height in cm for person " + (i + 1) + ": ");
            hwData[i][1] = sc.nextDouble();
            System.out.print("Enter weight in kg for person " + (i + 1) + ": ");
            hwData[i][0] = sc.nextDouble();
        }

        String[][] bmiResult = calculateBMI(hwData);
        displayTable(bmiResult);
    }
}
