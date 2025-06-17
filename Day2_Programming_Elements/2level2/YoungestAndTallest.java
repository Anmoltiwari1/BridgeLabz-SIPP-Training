import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + friends[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        int minAgeIndex = 0;
        int maxHeightIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        System.out.println("\nYoungest: " + friends[minAgeIndex] + " (" + ages[minAgeIndex] + " years)");
        System.out.println("Tallest: " + friends[maxHeightIndex] + " (" + heights[maxHeightIndex] + " cm)");

        sc.close();
    }
}
