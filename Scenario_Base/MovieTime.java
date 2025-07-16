public class MovieTime {
    static void insertionSort(int[] showTimes) {
        for (int i = 1; i < showTimes.length; i++) {
            int key = showTimes[i];
            int j = i - 1;

            while (j >= 0 && showTimes[j] > key) {
                showTimes[j + 1] = showTimes[j];
                j = j - 1;
            }
            showTimes[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] showTimes = {1300, 1130, 1800, 1500, 1030}; // in 24hr format

        insertionSort(showTimes);

        for (int time : showTimes) {
            System.out.println("Show at: " + time);
        }
    }
}
