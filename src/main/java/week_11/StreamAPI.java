package week_11;

import java.util.Collections;
import java.util.List;

public class StreamAPI {
    public static List<Integer> processNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted(Collections.reverseOrder())
                .collect(Collections.toList());
    }
}
