import java.util.Arrays;
import java.util.HashSet;

public class LinearAndBinarySearchChallenge {

    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int i = 1;
        while (true) {
            if (!set.contains(i)) return i;
            i++;
        }
    }

    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println("First missing positive: " + firstMissingPositive(nums)); // 2
        System.out.println("Index of 4: " + binarySearch(nums, 4)); // Index may vary depending on sort
    }
}
