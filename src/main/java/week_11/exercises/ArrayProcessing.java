package week_11.exercises;

public class ArrayProcessing {
    public static Integer findSecondLargest(int[] array) {

        if (array == null || array.length < 2) {
            return null;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array ) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest == Integer.MIN_VALUE ? null : secondLargest;
    }
}
