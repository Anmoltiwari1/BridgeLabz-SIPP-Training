package Searching.Linear_Searching;
public class FindWordInSentences {
    public static void main(String[] args) {
        String[] sentences = {
            "Java is fun",
            "Python is powerful",
            "C++ is fast"
        };
        String word = "powerful";
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                System.out.println("Found in: " + sentence);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
