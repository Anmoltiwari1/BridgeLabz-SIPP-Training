import java.util.Scanner;

public class UpperCaseConversion {

    public static String toUpperUsingCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareUsingCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String custom = toUpperUsingCharAt(input);
        String builtin = input.toUpperCase();

        System.out.println("Custom Upper: " + custom);
        System.out.println("Built-in Upper: " + builtin);
        System.out.println("Are both equal? " + compareUsingCharAt(custom, builtin));
    }
}
