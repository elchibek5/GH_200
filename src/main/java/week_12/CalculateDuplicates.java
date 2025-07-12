package week_12;

import java.util.*;

public class CalculateDuplicates {
    public static List<int[]> calculateDuplicates(int[] numbers) {
        Map<Integer, Integer> occurred = new HashMap<>();

        for (int num : numbers) {
            occurred.put(num, occurred.getOrDefault(num, 0) + 1);
        }

        List<int[]> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : occurred.entrySet()) {
            result.add(new int[]{entry.getKey(), entry.getValue()});
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 1, 2, 4, 5, 4};
        List<int[]> result = calculateDuplicates(numbers);

        for (int[] pair : result) {
            System.out.print("[" + pair[0] + "," + pair[1] + "]");
        }
    }
}

