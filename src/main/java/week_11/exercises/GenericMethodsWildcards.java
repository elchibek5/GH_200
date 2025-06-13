package week_11.exercises;

import java.util.List;

public class GenericMethodsWildcards {
    public static double sumNumbers(List<? extends Number> numbers) {

        return numbers.stream()
                .mapToDouble(Number::doubleValue)
                .sum();
    }
}
