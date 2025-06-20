import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Convert (1)C to F or (2)F to C: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Celsius: ");
            double c = sc.nextDouble();
            System.out.println("Fahrenheit: " + cToF(c));
        } else {
            System.out.print("Enter Fahrenheit: ");
            double f = sc.nextDouble();
            System.out.println("Celsius: " + fToC(f));
        }
    }

    static double cToF(double c) {
        return (c * 9/5) + 32;
    }

    static double fToC(double f) {
        return (f - 32) * 5/9;
    }
}
