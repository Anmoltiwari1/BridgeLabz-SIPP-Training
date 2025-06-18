import java.util.Arrays;

public class OtpGenerator {

    // Generate a 6-digit OTP using Math.random()
    public static int generateOtp() {
        return (int)(100000 + Math.random() * 900000); // Ensures 6-digit number
    }

    // Generate 10 OTPs and store in array
    public static int[] generateOtpArray(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOtp();
        }
        return otps;
    }

    // Check if all OTPs in the array are unique
    public static boolean areOtpsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true;
    }

    // Display the OTPs
    public static void displayOtps(int[] otps) {
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
    }

    // Main method to call the above
    public static void main(String[] args) {
        int[] otps = generateOtpArray(10);
        displayOtps(otps);

        boolean unique = areOtpsUnique(otps);
        System.out.println("Are all OTPs unique? " + unique);
    }
}
