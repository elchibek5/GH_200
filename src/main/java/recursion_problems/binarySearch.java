package recursion_problems;

public class binarySearch {
    public int binary(int[] A, int left, int right, int x) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;

        if (x == A[mid]) {
            return mid;
        }

        if (x < A[mid]) {
            return binary(A, left, mid - 1, x);
        }

        return binary(A, mid + 1, right, x);
    }

    public static void main(String[] args) {
        binarySearch bs = new binarySearch();
        int[] A = {1, 2, 4, 5, 9, 11, 17};
        int target = 5;

        int result = bs.binary(A, 0, A.length - 1, target);
        System.out.println(result);
    }

}
