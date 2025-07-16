public class FoodFest {
    public static void mergeSort(int[] footfall, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(footfall, l, mid);
            mergeSort(footfall, mid + 1, r);
            merge(footfall, l, mid, r);
        }
    }

    public static void merge(int[] footfall, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = footfall[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = footfall[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                footfall[k++] = L[i++];
            } else {
                footfall[k++] = R[j++];
            }
        }

        while (i < n1) footfall[k++] = L[i++];
        while (j < n2) footfall[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] footfall = {150, 230, 180, 90, 300, 220}; // Example from zones
        mergeSort(footfall, 0, footfall.length - 1);

        System.out.println("Sorted Footfall:");
        for (int count : footfall) {
            System.out.print(count + " ");
        }
    }
}
