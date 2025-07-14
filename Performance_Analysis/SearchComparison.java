package Performance_Analysis;
import java.util.*;

public class SearchComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1_000_000};
        Random rand = new Random();

        for (int size : sizes) {
            int[] data = rand.ints(size, 1, size * 10).toArray();
            int target = data[size - 1];

            // Linear Search
            long start = System.nanoTime();
            linearSearch(data, target);
            long linearTime = System.nanoTime() - start;

            // Binary Search
            Arrays.sort(data);
            start = System.nanoTime();
            Arrays.binarySearch(data, target);
            long binaryTime = System.nanoTime() - start;

            System.out.println("Dataset: " + size);
            System.out.println("Linear: " + linearTime / 1_000_000.0 + " ms");
            System.out.println("Binary: " + binaryTime / 1_000_000.0 + " ms\n");
        }
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target) return i;
        return -1;
    }
}
