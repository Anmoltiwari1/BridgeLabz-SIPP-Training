import java.util.Scanner;

public class LowerCaseConversion {

    public static String toLowerUsingCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
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

        String custom = toLowerUsingCharAt(input);
        String builtin = input.toLowerCase();

        System.out.println("Custom Lower: " + custom);
        System.out.println("Built-in Lower: " + builtin);
        System.out.println("Are both equal? " + compareUsingCharAt(custom, builtin));
    }
}
