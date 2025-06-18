import java.util.Scanner;

public class NumberFormatDemo {

    public static void throwException(String text) {
        int num = Integer.parseInt(text); // Can crash
        System.out.println("Parsed number: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numeric string: ");
        String input = sc.next();

        // throwException(input); // Uncomment to test crash
        handleException(input);
    }
}
