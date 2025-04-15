package homeworks;

import java.util.Scanner;

public class vasya_speeding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int t = sc.nextInt();

        int position = ((v * t) % 109 + 109) % 109;
        System.out.println(position);

    }
}
