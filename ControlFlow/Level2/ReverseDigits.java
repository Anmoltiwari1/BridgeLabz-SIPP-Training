import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0, temp = number;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        System.out.println("Reversed digits:");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }

        sc.close();
    }
}
