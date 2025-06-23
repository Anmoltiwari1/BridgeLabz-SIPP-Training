public class WordReplacer {
    public static String replaceWord(String original, String toReplace, String replacement) {
        return original.replaceAll("\\b" + toReplace + "\\b", replacement);
    }
}
