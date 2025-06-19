import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindromeLoop(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static boolean isPalindromeByReverse(String str) {
        char[] original = str.toCharArray();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) reverse += str.charAt(i);

        return str.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Loop method: " + isPalindromeLoop(text));
        System.out.println("Recursive method: " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Reverse compare method: " + isPalindromeByReverse(text));
    }
}
