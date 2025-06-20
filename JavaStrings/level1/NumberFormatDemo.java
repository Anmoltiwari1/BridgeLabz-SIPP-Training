package JavaStrings.level1;
import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException(String input) {
        int num = Integer.parseInt(input); // may throw NumberFormatException
        System.out.println("Parsed number: " + num);
    }

    public static void handleException(String input) {
        try {
            int num = Integer.parseInt(input);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as string: ");
        String str = sc.next();
        // generateException(str); // Uncomment to crash
        handleException(str);
    }
}
