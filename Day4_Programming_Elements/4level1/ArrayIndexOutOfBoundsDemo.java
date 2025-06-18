
public class ArrayIndexOutOfBoundsDemo {

    public static void throwException(String[] names) {
        System.out.println(names[5]); // Out of bounds
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        // throwException(names); // Uncomment to see crash
        handleException(names);
    }
}
