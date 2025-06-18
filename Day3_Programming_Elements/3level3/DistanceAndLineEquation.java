import java.util.Scanner;

public class DistanceAndLineEquation {

    // Method to calculate Euclidean distance
    public static double getEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to get the slope and y-intercept of the line
    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; // [0] => slope (m), [1] => y-intercept (b)
        
        if (x2 == x1) {
            throw new ArithmeticException("Slope is undefined for vertical lines (x1 == x2)");
        }

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        result[0] = m;
        result[1] = b;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Compute and display distance
        double distance = getEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance = %.4f\n", distance);

        try {
            // Compute and display line equation
            double[] line = getLineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of Line: y = %.2fx + %.2f\n", line[0], line[1]);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
