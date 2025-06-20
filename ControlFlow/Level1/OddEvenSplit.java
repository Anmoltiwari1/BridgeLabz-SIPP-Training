import java.util.Scanner;

public class OddEvenSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if(number < 1) {
            System.out.println("Not a natural number.");
            return;
        }

        int[] odd = new int[number/2 + 1];
        int[] even = new int[number/2 + 1];
        int o = 0, e = 0;

        for(int i = 1; i <= number; i++) {
            if(i % 2 == 0) even[e++] = i;
            else odd[o++] = i;
        }

        System.out.print("Odd numbers: ");
        for(int i = 0; i < o; i++) System.out.print(odd[i] + " ");

        System.out.print("\nEven numbers: ");
        for(int i = 0; i < e; i++) System.out.print(even[i] + " ");
    }
}
