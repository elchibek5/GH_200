package recursion_problems;

import java.util.Scanner;

public class canReach3or5 {
    private boolean canReach(int current, int target) {
        if (current == target) return true;
        if (current > target) return false;

        return canReach(current + 3, target) || canReach(current + 5, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();

        canReach3or5 r = new canReach3or5();
        boolean result = r.canReach(1, num);
        System.out.println(result ? "YES" : "NO");
    }
}
