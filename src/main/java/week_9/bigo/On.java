package week_9.bigo;

public class On {
    public static int findMax(int[] array) {
        int max = Integer.MAX_VALUE;

        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }

        return max;
        // Time complexity: O(n) - we must examine each element exactly once
    }
}
