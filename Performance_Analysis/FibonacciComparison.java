package Performance_Analysis;
public class FibonacciComparison {
    public static void main(String[] args) {
        int n = 30;

        long start = System.nanoTime();
        fibonacciRecursive(n);
        System.out.println("Recursive: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        fibonacciIterative(n);
        System.out.println("Iterative: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");
    }

    static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
