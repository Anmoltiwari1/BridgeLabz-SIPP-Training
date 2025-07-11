public class ComparePerformance {
    public static void main(String[] args) {
        int n = 1000000;
        long start, end;

        StringBuffer sbuf = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) sbuf.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuffer: " + (end - start) + " ns");

        StringBuilder sbuilder = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) sbuilder.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuilder: " + (end - start) + " ns");
    }
}
