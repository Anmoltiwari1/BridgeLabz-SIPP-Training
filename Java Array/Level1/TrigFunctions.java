import java.util.Scanner;

public class TrigFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        return new double[]{
            Math.sin(rad),
            Math.cos(rad),
            Math.tan(rad)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine: %.4f, Cosine: %.4f, Tangent: %.4f%n", results[0], results[1], results[2]);
    }
}
