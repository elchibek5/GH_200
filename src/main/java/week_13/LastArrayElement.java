package week_13;

public class LastArrayElement {
    public static int getLastElement(int[] array) throws IllegalAccessException {
        if (array == null || array.length == 0) {
            throw new IllegalAccessException("Array is empty or null");
        }
        return array[array.length - 1];
    }

    public static void main(String[] args) throws IllegalAccessException {
        int[] nums = {1, 3, 6, 4, 7};
        System.out.println("The last element: " + getLastElement(nums));
    }
}