public class InverterString {
    public static String inverterString(String string) {
        StringBuilder reversed = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed.append(string.charAt(i));
        }
        return reversed.toString();
    }
}
