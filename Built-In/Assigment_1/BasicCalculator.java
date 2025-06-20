import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operation: 1) Add 2) Subtract 3) Multiply 4) Divide");
        int choice = sc.nextInt();
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        switch (choice) {
            case 1 -> System.out.println("Sum: " + add(a, b));
            case 2 -> System.out.println("Difference: " + subtract(a, b));
            case 3 -> System.out.println("Product: " + multiply(a, b));
            case 4 -> {
                if (b != 0)
                    System.out.println("Quotient: " + divide(a, b));
                else
                    System.out.println("Cannot divide by zero!");
            }
            default -> System.out.println("Invalid choice");
        }
    }

    static double add(double a, double b) { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) { return a / b; }
}
