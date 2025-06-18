import java.util.Scanner;

public class CharArrayCompare {

    public static char[] getCharsUsingCharAt(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] manualArray = getCharsUsingCharAt(text);
        char[] builtinArray = text.toCharArray();

        System.out.println("Are arrays equal? " + compareCharArrays(manualArray, builtinArray));
    }
}
