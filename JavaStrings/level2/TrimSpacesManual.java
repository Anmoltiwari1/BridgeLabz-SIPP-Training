import java.util.Scanner;

public class TrimSpacesManual {

    public static int[] findTrimIndexes(String str) {
        int start = 0, end = 0;

        try {
            int len = 0;
            while (true) str.charAt(len++);
        } catch (Exception e) {}

        while (start < end || str.charAt(start) == ' ') start++;
        end = str.length() - 1;
        while (end > start && str.charAt(end) == ' ') end--;

        return new int[]{start, end + 1};
    }

    public static String getSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String manualTrimmed = getSubstring(input, indexes[0], indexes[1]);
        String builtInTrimmed = input.trim();

        System.out.println("Manual Trimmed: " + manualTrimmed);
        System.out.println("Built-in Trimmed: " + builtInTrimmed);
        System.out.println("Match? " + compareStrings(manualTrimmed, builtInTrimmed));
    }
}
