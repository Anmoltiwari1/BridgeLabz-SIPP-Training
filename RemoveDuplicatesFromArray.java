import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Removing duplicates
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!uniqueList.contains(arr[i])) {
                uniqueList.add(arr[i]);
            }
        }

        // Output unique elements
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueList) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
