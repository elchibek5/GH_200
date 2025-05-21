package week_9.java_lessons;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // InputStream operates with bytes
        InputStream is = new FileInputStream("src/main/java/week_9/java_lessons/Input.txt");
        byte[] allBytes = is.readAllBytes();
        String result = new String(allBytes);
        System.out.println(result);
        System.out.println(allBytes.length);

        // Reader operate with characters
        Reader reader  = new FileReader("src/main/java/week_9/java_lessons/Input.txt");
        char[] input = new char[100];

        int n = reader.read(input);
        System.out.println(n);

        System.out.println(new String(input, 0, n));
    }
}
