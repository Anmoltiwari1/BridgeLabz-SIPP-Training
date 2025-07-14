package Searching.FileReaderProblems;
import java.io.*;

public class CountWordInFile {
    public static void main(String[] args) throws IOException {
        String target = "java";
        int count = 0;
        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words)
                if (word.equalsIgnoreCase(target)) count++;
        }
        reader.close();
        System.out.println("Word '" + target + "' occurred: " + count + " times");
    }
}
