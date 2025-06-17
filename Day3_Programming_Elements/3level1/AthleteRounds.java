import java.util.Scanner;

public class AthleteRounds {
    public static int calculateRounds(int a, int b, int c) {
        int perimeter = a + b + c;
        int meters = 5000; // 5 km in meters
        return meters / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of triangle in meters: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int rounds = calculateRounds(a, b, c);
        System.out.println("Rounds required to complete 5 km: " + rounds);
    }
}
