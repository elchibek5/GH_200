package week_11;

public class Solving_Problems {
    public static String calculateOperations(int a, int b) {
        int sum = a + b;
        int differences = a - b;
        int product = a * b;

        return String.format("Sum: %d. Difference: %d, Product: %d", sum, differences, product);
    }
}
