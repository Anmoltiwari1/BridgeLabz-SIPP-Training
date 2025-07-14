package Searching.Binary_Searching;
public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 3, 20, 4, 1};
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            boolean leftCheck = mid == 0 || nums[mid] > nums[mid - 1];
            boolean rightCheck = mid == nums.length - 1 || nums[mid] > nums[mid + 1];
            if (leftCheck && rightCheck) {
                System.out.println("Peak element: " + nums[mid]);
                return;
            } else if (!leftCheck)
                right = mid - 1;
            else
                left = mid + 1;
        }
    }
}
