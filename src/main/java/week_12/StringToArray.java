package week_12;

import java.util.Arrays;

public class StringToArray {
    public static String[] stringToArray(String word) {
        return word.split("");
    }

    public static void main(String[] args) {
        String[] result = stringToArray("HEllo");
        System.out.println(Arrays.toString(result));
    }
}
