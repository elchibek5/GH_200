package week_9.java_lessons;

import java.io.*;

public class Input {
    public static void example() throws IOException {

        // InputStream operates with bytes
        InputStream is = new FileInputStream("src/main/java/week_9/java_lessons/Input.txt");
        byte[] allBytes = is.readAllBytes();
        for (byte b : allBytes) {
            System.out.printf("%d, ", b);
        }

        System.out.println();
        is.close();
        // Reader operate with characters
        Reader reader  = new FileReader("src/main/java/week_9/java_lessons/Input.txt");
        char[] input = new char[100];

        int n = reader.read(input);
        System.out.println(n);

        System.out.println(new String(input, 0, n));
        reader.close();
    }
}
