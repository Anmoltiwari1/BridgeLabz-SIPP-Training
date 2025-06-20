import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            physics[i] = sc.nextInt();
            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();
            System.out.print("Maths: ");
            maths[i] = sc.nextInt();

            double total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 45) grade[i] = 'D';
            else grade[i] = 'F';
        }

        System.out.println("\nPhysics Chemistry Maths Percentage Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%7d %9d %5d %10.2f %6c%n", physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }

        sc.close();
    }
}
