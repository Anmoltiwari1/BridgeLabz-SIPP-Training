package Performance_Analysis;
import java.util.*;

public class SortingComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000}; // Avoid 1M for Bubble Sort
        Random rand = new Random();

        for (int size : sizes) {
            int[] original = rand.ints(size, 1, size * 10).toArray();

            int[] bubble = Arrays.copyOf(original, size);
            int[] merge = Arrays.copyOf(original, size);
            int[] quick = Arrays.copyOf(original, size);

            long start = System.nanoTime();
            bubbleSort(bubble);
            System.out.println("Bubble Sort (" + size + "): " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

            start = System.nanoTime();
            mergeSort(merge, 0, merge.length - 1);
            System.out.println("Merge Sort  (" + size + "): " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

            start = System.nanoTime();
            quickSort(quick, 0, quick.length - 1);
            System.out.println("Quick Sort  (" + size + "): " + (System.nanoTime() - start) / 1_000_000.0 + " ms\n");
        }
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1], R = new int[n2];
        for (int i = 0; i < n1; ++i) L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2)
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++)
            if (arr[j] < pivot)
                swap(arr, ++i, j);
        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
