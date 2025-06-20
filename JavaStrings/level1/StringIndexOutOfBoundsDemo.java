package JavaStrings.level1;
import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateException(String str) {
        System.out.println(str.charAt(str.length())); // out of bounds
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        // generateException(input); // Uncomment to crash
        handleException(input);
    }
}
