import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void throwException(String text) {
        System.out.println(text.substring(5, 2)); // IllegalArgumentException
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.next();

        // throwException(input); // Uncomment to test crash
        handleException(input);
    }
}
