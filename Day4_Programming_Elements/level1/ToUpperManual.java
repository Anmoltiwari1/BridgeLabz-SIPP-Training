package level1;
import java.util.Scanner;

public class ToUpperManual {

    public static String convertToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char) (c - 32);
            } else {
                result += c;
            }
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
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String manualUpper = convertToUpper(input);
        String builtInUpper = input.toUpperCase();

        boolean same = compareStrings(manualUpper, builtInUpper);
        System.out.println("Manual Upper: " + manualUpper);
        System.out.println("Built-in Upper: " + builtInUpper);
        System.out.println("Are both same? " + same);
    }
}
