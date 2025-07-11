public class SearchWordInSentences {
    public static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) return sentence;
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sents = {"Hello world", "Java is fun", "Search me"};
        System.out.println(findSentence(sents, "Java")); // Output: Java is fun
    }
}
