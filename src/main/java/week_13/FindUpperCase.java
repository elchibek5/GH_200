package week_13;

public class FindUpperCase {
    public static String extractUpperCase(String input) {
        StringBuilder result = new StringBuilder();

        if (input == null) return null;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 65 && ch <= 90) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String word = "HeLLO, WorLD";
        System.out.println(extractUpperCase(word));
    }
}
