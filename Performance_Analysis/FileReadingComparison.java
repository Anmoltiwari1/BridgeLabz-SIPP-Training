package Performance_Analysis;
import java.io.*;

public class FileReadingComparison {
    public static void main(String[] args) throws IOException {
        File file = new File("sample.txt"); // use a large file
        if (!file.exists()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < 10_000_000; i++) writer.write("Line " + i + "\n");
            writer.close();
        }

        // FileReader
        long start = System.nanoTime();
        FileReader fr = new FileReader(file);
        while (fr.read() != -1) {}
        fr.close();
        System.out.println("FileReader: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        // InputStreamReader
        start = System.nanoTime();
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
        while (isr.read() != -1) {}
        isr.close();
        System.out.println("InputStreamReader: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");
    }
}
