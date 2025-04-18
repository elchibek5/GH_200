package week_4.homeworks;

public class MathUtils {
    // MathUtils utility class
    public static class Math {
        private static int operationCount;

        static {
            // Initialiaze static counter
            operationCount = 0;
        }

        // Static method to add two numbers
        public static int add(int a, int b) {
            // Increment operation count and return sum
            operationCount++;
            return a + b;
        }

        public static int getOperationsCount() {
            return operationCount;
        }
    }

    public static class Main{
        public static void main(String[] args) {
            int result1 = Math.add(3, 5);
            int result2 = Math.add(3, 10);

            System.out.println("Result 1 is: " + result1);
            System.out.println("Result 2 is: " + result2);
            System.out.println("Operations performed: " + Math.getOperationsCount());
        }
    }

}
