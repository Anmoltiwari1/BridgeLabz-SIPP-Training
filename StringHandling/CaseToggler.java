public class CaseToggler {
    public static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c))
                toggled.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c))
                toggled.append(Character.toUpperCase(c));
            else
                toggled.append(c);
        }
        return toggled.toString();
    }
}
