import java.util.Scanner;

public class VowelConsonantCount {

    public static String getCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char) (ch + 32); // Convert to lowercase
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) >= 0) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (int i = 0; ; i++) {
            try {
                char ch = str.charAt(i);
                String type = getCharType(ch);
                if (type.equals("Vowel")) vowels++;
                else if (type.equals("Consonant")) consonants++;
            } catch (Exception e) {
                break;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] result = countVowelsAndConsonants(input);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
