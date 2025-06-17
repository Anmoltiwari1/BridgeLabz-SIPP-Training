import java.util.Scanner;

public class TeamBMICalculator {

    public static double calculateBMI(double weightKg, double heightCm) {
        double heightMeters = heightCm / 100.0;
        return weightKg / (heightMeters * heightMeters);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] teamData = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for member " + (i + 1) + ": ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for member " + (i + 1) + ": ");
            teamData[i][1] = sc.nextDouble();
            teamData[i][2] = calculateBMI(teamData[i][0], teamData[i][1]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("\nMember %d - Weight: %.2f kg, Height: %.2f cm, BMI: %.2f, Status: %s",
                    i + 1, teamData[i][0], teamData[i][1], teamData[i][2], getBMIStatus(teamData[i][2]));
        }

        sc.close();
    }
}