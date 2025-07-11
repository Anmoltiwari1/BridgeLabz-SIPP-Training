public class FirstNegative {
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, -2, 8};
        System.out.println(findFirstNegative(arr)); // Output: 2
    }
}
