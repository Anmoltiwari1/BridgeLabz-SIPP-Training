package JavaStrings.level1;
import java.util.Scanner;

public class SubstringUsingCharAt {

    public static String getSubstringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manualSubstring = getSubstringUsingCharAt(text, start, end);
        String builtInSubstring = text.substring(start, end);
        boolean isSame = compareStrings(manualSubstring, builtInSubstring);

        System.out.println("Manual Substring: " + manualSubstring);
        System.out.println("Built-in Substring: " + builtInSubstring);
        System.out.println("Are both substrings equal? " + isSame);
    }
}
