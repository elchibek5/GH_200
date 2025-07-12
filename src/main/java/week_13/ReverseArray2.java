package week_13;

public class ReverseArray2 {
    public static void reverseArray(int[] array) {
        if (array == null) return;

        int left = 0;
        int right  = array.length - 1;

        while (left < right) {
            int temp =  array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        reverseArray(nums);

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
