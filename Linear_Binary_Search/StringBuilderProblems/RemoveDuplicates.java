import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming")); // Output: progamin
    }
}
