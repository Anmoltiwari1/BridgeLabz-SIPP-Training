import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            nums[i] = sc.nextInt();
        }

        for(int num : nums) {
            if(num > 0)
                System.out.println(num + " is Positive and " + (num % 2 == 0 ? "Even" : "Odd"));
            else if(num < 0)
                System.out.println(num + " is Negative");
            else
                System.out.println("Zero");
        }

        if(nums[0] == nums[4])
            System.out.println("First and last elements are Equal");
        else if(nums[0] > nums[4])
            System.out.println("First element is Greater than last");
        else
            System.out.println("First element is Less than last");
    }
}
