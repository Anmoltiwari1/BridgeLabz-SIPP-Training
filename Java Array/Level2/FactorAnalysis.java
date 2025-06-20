import java.util.Scanner;

public class FactorAnalysis {

    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0) factors[index++] = i;

        return factors;
    }

    public static int findSum(int[] array) {
        int sum = 0;
        for (int num : array) sum += num;
        return sum;
    }

    public static int findProduct(int[] array) {
        int product = 1;
        for (int num : array) product *= num;
        return product;
    }

    public static int findSumOfSquares(int[] array) {
        int sum = 0;
        for (int num : array) sum += Math.pow(num, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = getFactors(number);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Sum of factors: " + findSum(factors));
        System.out.println("Product of factors: " + findProduct(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));
        sc.close();
    }
}
