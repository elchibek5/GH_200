package week_11.exercises;

public class ReverseString {
    public static String reverseString(String input) {

        if (input == null) return null;
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return new String(chars);
    }
}
