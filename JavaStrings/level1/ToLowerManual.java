package JavaStrings.level1;
import java.util.Scanner;

public class ToLowerManual {

    public static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char) (c + 32);
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

        String manualLower = convertToLower(input);
        String builtInLower = input.toLowerCase();

        boolean same = compareStrings(manualLower, builtInLower);
        System.out.println("Manual Lower: " + manualLower);
        System.out.println("Built-in Lower: " + builtInLower);
        System.out.println("Are both same? " + same);
    }
}
