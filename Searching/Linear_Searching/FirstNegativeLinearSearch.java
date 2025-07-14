package Searching.Linear_Searching;
public class FirstNegativeLinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 7, 0, -2, 10};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0) {
                System.out.println("First negative at index: " + i);
                return;
            }
        System.out.println("No negative number found");
    }
}
