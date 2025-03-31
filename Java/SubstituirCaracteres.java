public class SubstituirCaracteres {
    public static String substituirCaracteres(String string) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (vowels.indexOf(c) != -1) {
                result.append('?');
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
