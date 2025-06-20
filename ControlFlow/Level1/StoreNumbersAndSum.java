import java.util.Scanner;

public class StoreNumbersAndSum {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        Scanner sc = new Scanner(System.in);

        while(true) {
            if(index == 10) break;

            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if(num <= 0) break;

            numbers[index++] = num;
        }

        System.out.print("Numbers entered: ");
        for(int i = 0; i < index; i++) {
            total += numbers[i];
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nSum = " + total);
        sc.close();
    }
}
