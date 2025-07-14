package Searching.Binary_Searching;
public class FindRotationPoint {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) left = mid + 1;
            else right = mid;
        }
        System.out.println("Rotation point index: " + left);
    }
}
