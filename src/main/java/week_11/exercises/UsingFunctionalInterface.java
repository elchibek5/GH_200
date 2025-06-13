package week_11.exercises;

public class UsingFunctionalInterface {
    @FunctionalInterface
    interface MathOperation {
        int calculate(int a, int b);
    }

    public static int applyOperation(int a, int b, MathOperation operation) {
        return operation.calculate(a, b);
    }

    public static void demonstrateLambdas() {
        MathOperation addition = Integer::sum;
        MathOperation multiplication = (x, y) -> x * y;
        MathOperation substraction = (x, y) -> x - y;

        System.out.println("Addition: " + applyOperation(5, 3, addition));
        System.out.printf("Multiplication : " + applyOperation(5, 3, multiplication));
        System.out.println("Substraction: " + applyOperation(5, 3, substraction));

    }
}
