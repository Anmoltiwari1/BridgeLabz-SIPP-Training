package Searching.Challenge;
import java.io.*;

public class AllInOneComparison {
    public static void main(String[] args) throws IOException {
        int count = 1_000_000;

        // StringBuilder
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) sb.append("hello");
        long builderTime = System.nanoTime() - start;

        // StringBuffer
        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < count; i++) sbuf.append("hello");
        long bufferTime = System.nanoTime() - start;

        System.out.println("StringBuilder time: " + builderTime / 1_000_000 + " ms");
        System.out.println("StringBuffer  time: " + bufferTime / 1_000_000 + " ms");

        // File Reading Word Count
        countWords("sample.txt");
    }

    static void countWords(String fileName) throws IOException {
        // FileReader
        BufferedReader fr = new BufferedReader(new FileReader(fileName));
        int wordCount = 0;
        String line;
        while ((line = fr.readLine()) != null)
            wordCount += line.split("\\s+").length;
        fr.close();
        System.out.println("FileReader word count: " + wordCount);
    }
}
