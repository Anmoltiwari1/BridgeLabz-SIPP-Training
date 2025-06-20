import java.util.Scanner;

public class NumberClassification {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        return Integer.compare(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + " is Positive and " + (isEven(numbers[i]) ? "Even" : "Odd"));
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        System.out.print("Comparison of first and last: ");
        if (result == 0) System.out.println("Equal");
        else if (result < 0) System.out.println("First is Less than Last");
        else System.out.println("First is Greater than Last");

        sc.close();
    }
}