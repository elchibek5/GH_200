package week_11.exercises;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class StringFilter {
    public static List<String> filterStrings(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str != null && str.length() > 3 && Character.isUpperCase(str.charAt(0))) {
                result.add(str);
            }
        }
        return result;
    }
}