package Searching.StringBuilder;
public class ReverseStringBuilder {
    public static void main(String[] args) {
        String input = "hello";
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println("Reversed: " + sb.toString());
    }
}
