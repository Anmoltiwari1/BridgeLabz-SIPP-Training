import java.util.Scanner;

public class UniqueCharactersFinder {

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) str.charAt(count++);
        } catch (Exception e) {
            return count;
        }
    }

    public static char[] findUniqueChars(String str) {
        int len = getLength(str);
        char[] unique = new char[len];
        int uIndex = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique[uIndex++] = ch;
        }

        char[] result = new char[uIndex];
        for (int i = 0; i < uIndex; i++) result[i] = unique[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] unique = findUniqueChars(text);
        System.out.print("Unique characters: ");
        for (char ch : unique) System.out.print(ch + " ");
    }
}
