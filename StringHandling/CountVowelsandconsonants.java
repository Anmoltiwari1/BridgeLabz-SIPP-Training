
import java.util.Scanner;

public class CountVowelsandconsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");   
        String input = sc.nextLine();
        int vowelsCount = 0;
        int consonantsCount = 0;        
        String vowels = "aeiouAEIOU";
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelsCount++;
            } else if (consonants.indexOf(ch) != -1) {
                consonantsCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount); 
    }
}
