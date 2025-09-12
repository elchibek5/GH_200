package week_10.practice_java;

import java.util.ArrayList;
import java.util.Scanner;

public class CycleShiftRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        int n = sc.nextInt();

        // Create a dynamic array (ArrayList) to store the input numbers
        ArrayList<Integer> a = new ArrayList<>();

        // Read n integers from input and add them to array 'a'
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a.add(x);
        }

        // Create a new array 'b' to hold the shifted result
        ArrayList<Integer> b = new ArrayList<>();

        // Step 1: Add the last element of 'a' to the front of 'b'
        b.add(a.get(a.size() - 1));

        // Step 2: Add the rest of the elements from 'a', starting from index 0 to n-2
        for (int i = 0; i < n - 1; i++) {
            b.add(a.get(i));
        }

        // Replace 'a' with the shifted version stored in 'b'
        a = b;

        // Print the shifted array
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", a.get(i));
        }
    }
}