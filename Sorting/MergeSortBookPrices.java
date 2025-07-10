package Sorting;
public class MergeSortBookPrices {
    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);
            merge(prices, left, mid, right);
        }
    }

    private static void merge(int[] prices, int left, int mid, int right) {
        int[] leftArr = new int[mid - left + 1];
        int[] rightArr = new int[right - mid];

        for (int i = 0; i < leftArr.length; i++) leftArr[i] = prices[left + i];
        for (int i = 0; i < rightArr.length; i++) rightArr[i] = prices[mid + 1 + i];

        int i = 0, j = 0, k = left;
        while (i < leftArr.length && j < rightArr.length) {
            prices[k++] = (leftArr[i] <= rightArr[j]) ? leftArr[i++] : rightArr[j++];
        }

        while (i < leftArr.length) prices[k++] = leftArr[i++];
        while (j < rightArr.length) prices[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        int[] prices = {450, 300, 250, 500, 400};
        mergeSort(prices, 0, prices.length - 1);
        for (int price : prices) System.out.print(price + " ");
    }
}
