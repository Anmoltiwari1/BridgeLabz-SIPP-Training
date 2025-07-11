public class FirstAndLastOccurrence {
    public static int[] findFirstAndLast(int[] arr, int target) {
        int first = -1, last = -1;
        int low = 0, high = arr.length - 1;

        // First occurrence
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target) low = mid + 1;
            else {
                if (arr[mid] == target) first = mid;
                high = mid - 1;
            }
        }

        low = 0;
        high = arr.length - 1;
        // Last occurrence
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) high = mid - 1;
            else {
                if (arr[mid] == target) last = mid;
                low = mid + 1;
            }
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int[] res = findFirstAndLast(arr, 2);
        System.out.println("First: " + res[0] + ", Last: " + res[1]); // Output: First: 1, Last: 3
    }
}
