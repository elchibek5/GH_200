package week_4.solvingProblems;

import java.util.Scanner;

public class greaterNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(1);
        } else if (a < b){
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
