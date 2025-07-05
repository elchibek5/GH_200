package week_11;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors; // Add this import

public class StreamAPI {
    public static List<Integer> processNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList()); // Correct this line
    }
}
