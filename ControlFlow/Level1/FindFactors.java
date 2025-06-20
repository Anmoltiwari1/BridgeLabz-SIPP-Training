import java.util.Arrays;
import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = new int[10];
        int index = 0;
        int size = 10;

        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                if(index == size) {
                    size *= 2;
                    factors = Arrays.copyOf(factors, size);
                }
                factors[index++] = i;
            }
        }

        System.out.print("Factors: ");
        for(int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
