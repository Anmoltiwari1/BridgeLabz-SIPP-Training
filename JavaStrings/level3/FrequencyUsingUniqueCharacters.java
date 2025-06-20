package JavaStrings.level3;
import java.util.Scanner;

public class FrequencyUsingUniqueCharacters {

    public static char[] findUniqueChars(String str) {
        int len = str.length();
        char[] unique = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique[index++] = ch;
        }

        char[] result = new char[index];
        System.arraycopy(unique, 0, result, 0, index);
        return result;
    }

    public static int[] getFrequencies(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = findUniqueChars(text);
        int[] freq = getFrequencies(text);

        System.out.println("Char\tFrequency");
        for (char ch : unique) {
            System.out.println(ch + "\t" + freq[ch]);
        }
    }
}
