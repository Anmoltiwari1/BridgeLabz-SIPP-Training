package Searching.StringBuffer;
public class ConcatenateStringBuffer {
    public static void main(String[] args) {
        String[] words = {"Java", "is", "awesome"};
        StringBuffer sb = new StringBuffer();
        for (String word : words) sb.append(word).append(" ");
        System.out.println("Concatenated: " + sb.toString().trim());
    }
}
