package week_9.bigo;

public class Nlogn {
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
//            merge(array, left, mid, right);
            }
        // Time complexity: 0(n log n) - log n levels of recursion, each doing 0(n) work
    }
}
