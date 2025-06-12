package week_10.practice_java;

import java.util.ArrayList;
import java.util.List;

public class BallsGame {
    public static int countDestroyedBallsOptimized(String balls) {
        if (balls == null || balls.length() < 3) {
            return 0;
        }

        char[] arr = balls.toCharArray();
        int totalDestroyed = 0;
        boolean hasChanges = true;

        while (hasChanges) {
            hasChanges = false;
            List<Character> temp = new ArrayList<>();

            int i = 0;
            while (i < arr.length) {
                char current = arr[i];
                int count = 1;

                while (i + count < arr.length && arr[i + count] == current) {
                    count++;
                }

                if (count >= 3) {
                    totalDestroyed += count;
                    hasChanges = true;
                } else {
                    for (int j = 0; j < count; j++) {
                        temp.add(current);
                    }
                }

                i += count;
            }

            arr = new char[temp.size()];
            for (int j = 0; j < temp.size(); j++) {
                arr[j] = temp.get(j);
            }
        }

        return totalDestroyed;
    }    
}
