package Sorting;
public class CountingSortStudentAges {
    public static void countingSort(int[] ages) {
        int max = 18, min = 10;
        int[] count = new int[max - min + 1];

        for (int age : ages) count[age - min]++;
        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) ages[idx++] = i + min;
        }
    }

    public static void main(String[] args) {
        int[] ages = {12, 17, 11, 10, 18, 15, 10};
        countingSort(ages);
        for (int age : ages) System.out.print(age + " ");
    }
}
