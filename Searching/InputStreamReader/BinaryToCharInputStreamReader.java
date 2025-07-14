package Searching.InputStreamReader;
import java.io.*;

public class BinaryToCharInputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream("sample.txt"), "UTF-8");
        BufferedReader br = new BufferedReader(reader);
        String line;
        while ((line = br.readLine()) != null)
            System.out.println(line);
        br.close();
    }
}
