import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void throwException(String text) {
        System.out.println(text.charAt(text.length())); // Out of bounds
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.next();

        // throwException(input); // Uncomment to see crash
        handleException(input);
    }
}
