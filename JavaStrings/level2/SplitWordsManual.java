import java.util.Scanner;

public class SplitWordsManual {

    public static String[] splitText(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) word += text.charAt(j);
                words[wordIndex++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compareWordArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] manualSplit = splitText(text);
        String[] builtInSplit = text.split(" ");

        boolean isEqual = compareWordArrays(manualSplit, builtInSplit);
        System.out.println("Manual split matches built-in split? " + isEqual);
    }
}
