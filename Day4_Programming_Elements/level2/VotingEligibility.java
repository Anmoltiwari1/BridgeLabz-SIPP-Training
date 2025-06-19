import java.util.Random;

public class VotingEligibility {

    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + r.nextInt(90); // random 2-digit age
        }
        return ages;
    }

    public static String[][] getVotingStatus(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18)
                result[i][1] = "Can Vote";
            else
                result[i][1] = "Cannot Vote";
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Age\tEligibility");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] status = getVotingStatus(ages);
        displayTable(status);
    }
}
