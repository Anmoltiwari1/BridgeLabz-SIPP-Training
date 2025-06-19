import java.util.Scanner;

public class VowelConsonantTable {

    public static String getCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char) (ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) >= 0) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] analyzeCharacters(String str) {
        int len = 0;
        try {
            while (true) str.charAt(len++);
        } catch (Exception e) {}

        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = getCharType(ch);
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Char\tType");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[][] table = analyzeCharacters(input);
        displayTable(table);
    }
}
