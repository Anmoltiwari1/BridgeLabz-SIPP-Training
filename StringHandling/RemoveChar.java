public class RemoveChar {
    public static String removeCharacter(String str, char ch) {
        return str.replaceAll(Character.toString(ch), "");
    }
}
