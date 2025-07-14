package Searching.Binary_Searching;
import java.util.*;

public class LinearBinaryChallenge {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int missing = firstMissingPositive(arr.clone());
        System.out.println("First missing positive: " + missing);

        Arrays.sort(arr);
        int target = 1;
        int index = Arrays.binarySearch(arr, target);
        System.out.println("Binary search index of " + target + ": " + index);
    }

    static int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        for (int i = 1; i <= nums.length + 1; i++)
            if (!set.contains(i)) return i;
        return -1;
    }
}
