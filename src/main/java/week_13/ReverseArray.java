package week_13;

public class ReverseArray {
    public static int[] reverseArray(int[] array) {
        if (array == null) return null;

        int[] answer = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            answer[i] = array[array.length - 1 - i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] old = {1, 2, 3, 4, 5, 6, 7};
        int[] newArr = reverseArray(old);

        for (int num : newArr) {
            System.out.println(num + " ");
        }
    }

}
