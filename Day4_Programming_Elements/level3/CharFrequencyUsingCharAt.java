import java.util.Scanner;

public class CharFrequencyUsingCharAt {

    public static String[][] getCharFrequencies(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        boolean[] visited = new boolean[256];
        int uniqueCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!visited[str.charAt(i)]) {
                visited[str.charAt(i)] = true;
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (visited[ch]) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                visited[ch] = false;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] freqTable = getCharFrequencies(text);
        System.out.println("Char\tFrequency");
        for (String[] row : freqTable) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
