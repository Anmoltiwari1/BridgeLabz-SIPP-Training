package Performance_Analysis;
public class StringConcatComparison {
    public static void main(String[] args) {
        int n = 100000;

        // String
        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) s += "a";
        System.out.println("String: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        // StringBuilder
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("a");
        System.out.println("StringBuilder: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        // StringBuffer
        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) sbuf.append("a");
        System.out.println("StringBuffer: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");
    }
}
