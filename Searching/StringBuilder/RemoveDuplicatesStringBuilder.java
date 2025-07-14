package Searching.StringBuilder;
import java.util.HashSet;

public class RemoveDuplicatesStringBuilder {
    public static void main(String[] args) {
        String input = "programming";
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                result.append(ch);
                seen.add(ch);
            }
        }
        System.out.println("Without duplicates: " + result.toString());
    }
}
