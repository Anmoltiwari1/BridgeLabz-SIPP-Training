import java.util.Scanner;

public class NumberGuessingGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int low = 1, high = 100;
        boolean correct = false;
        System.out.println("Think of a number between 1 and 100. I will try to guess it.");

        while (!correct && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter: high / low / correct)");
            String feedback = getUserFeedback();

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed it right.");
                correct = true;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            }
        }
    }

    static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }

    static String getUserFeedback() {
        return sc.next().toLowerCase();
    }
}
