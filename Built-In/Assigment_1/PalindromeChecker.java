import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        if (isPalindrome(input))
            System.out.println("It is a palindrome.");
        else
            System.out.println("It is not a palindrome.");
    }

    static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }
}
