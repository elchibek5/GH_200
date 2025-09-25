package informatics_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class possible_numbers {
    static int n;

    static void rec(int ind, boolean taken, ArrayList<Integer> arr) {
        if (ind > n) {
            if (taken) {
                for (int to : arr) {
                    System.out.print(to + " ");
                }
                System.out.println("");
            }
            return ;
        }

        if (taken) {
            arr.add(ind);
        }

        rec(ind + 1, true, arr);
        rec(ind + 1, false, arr);
        if (taken) {
            arr.remove(arr.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        rec(0, false, new ArrayList<Integer>());
    }
}
