public class challenge {

    public static int numsOfSubarrays(int[] nums, int n) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int a = i; a <= j; a++) {
                    sum += nums[a];
                }
                if (sum == n) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;

        int result = numsOfSubarrays(nums, target);
        System.out.println(result);
    }
}