import java.util.Arrays;

public class RandomArrayStats {

    public static int[] generate4DigitRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 9000) + 1000;
        }
        return array;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        double avg = sum / (double) numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] array = generate4DigitRandomArray(5);
        System.out.println("Generated Numbers: " + Arrays.toString(array));

        double[] result = findAverageMinMax(array);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f\n", result[0], result[1], result[2]);
    }
}
