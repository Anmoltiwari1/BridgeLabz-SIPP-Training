package Performance_Analysis;
import java.util.*;

public class DataStructureSearch {
    public static void main(String[] args) {
        int size = 1_000_000;
        int target = size - 1;

        // Array
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = i;
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) if (arr[i] == target) break;
        System.out.println("Array Search: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        // HashSet
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < size; i++) hashSet.add(i);
        start = System.nanoTime();
        hashSet.contains(target);
        System.out.println("HashSet Search: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < size; i++) treeSet.add(i);
        start = System.nanoTime();
        treeSet.contains(target);
        System.out.println("TreeSet Search: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");
    }
}
