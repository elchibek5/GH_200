package week_11;

import java.util.HashMap;
import java.util.Map;

public class MostFreqentCharacter {
    public static Character findMostFrequentCharacter(String input) {

        if (input == null || input.isEmpty()) {
            return null;
        }

        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequency.merge(c, 1, Integer::sum);
        }

        return frequency.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }
}
