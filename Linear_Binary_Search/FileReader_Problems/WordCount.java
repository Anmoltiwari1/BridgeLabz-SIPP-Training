import java.io.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        String line;
        int count = 0;
        String target = "hello";
        while ((line = reader.readLine()) != null) {
            for (String word : line.split("\\s+")) {
                if (word.equalsIgnoreCase(target)) count++;
            }
        }
        reader.close();
        System.out.println("Word count: " + count);
    }
}
