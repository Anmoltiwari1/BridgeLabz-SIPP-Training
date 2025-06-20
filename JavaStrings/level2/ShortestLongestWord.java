import java.util.Scanner;

public class ShortestLongestWord {

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

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[][] getWordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static String[] findShortestLongest(String[][] wordTable) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        String shortest = "", longest = "";

        for (String[] row : wordTable) {
            int len = Integer.parseInt(row[1]);
            if (len < min) {
                min = len;
                shortest = row[0];
            }
            if (len > max) {
                max = len;
                longest = row[0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] table = getWordLengthTable(words);
        String[] result = findShortestLongest(table);

        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
    }
}
