package Day2_Programming_Elements.Level1;

import java.util.Scanner;

public class LimitedInputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            if (index == 10) break;
            System.out.print("Enter number: ");
            double num = sc.nextDouble();

            if (num <= 0) break;

            numbers[index] = num;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("Total sum = " + total);
    }
}
