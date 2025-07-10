package Sorting;
public class SelectionSortExamScores {
    public static void selectionSort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIdx]) minIdx = j;
            }
            int tmp = scores[i];
            scores[i] = scores[minIdx];
            scores[minIdx] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {75, 60, 90, 85, 70};
        selectionSort(scores);
        for (int score : scores) System.out.print(score + " ");
    }
}
