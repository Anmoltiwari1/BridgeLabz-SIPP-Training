package Sorting;
public class HeapSortJobApplicants {
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(salaries, n, i);

        for (int i = n - 1; i > 0; i--) {
            int tmp = salaries[0]; salaries[0] = salaries[i]; salaries[i] = tmp;
            heapify(salaries, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1, r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest]) largest = l;
        if (r < n && arr[r] > arr[largest]) largest = r;

        if (largest != i) {
            int swap = arr[i]; arr[i] = arr[largest]; arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] salaries = {45000, 55000, 40000, 50000, 60000};
        heapSort(salaries);
        for (int sal : salaries) System.out.print(sal + " ");
    }
}
