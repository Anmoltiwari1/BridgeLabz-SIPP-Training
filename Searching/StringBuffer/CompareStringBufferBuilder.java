package Searching.StringBuffer;
public class CompareStringBufferBuilder {
    public static void main(String[] args) {
        int count = 1_000_000;

        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) sb.append("hello");
        long builderTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < count; i++) sbuf.append("hello");
        long bufferTime = System.nanoTime() - start;

        System.out.println("StringBuilder time: " + builderTime / 1_000_000 + " ms");
        System.out.println("StringBuffer  time: " + bufferTime / 1_000_000 + " ms");
    }
}
