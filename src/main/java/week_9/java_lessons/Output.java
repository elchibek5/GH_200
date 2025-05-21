package week_9.java_lessons;

import java.io.*;

public class Output {
    public static void example() throws IOException {
        OutputStream os = new FileOutputStream("src/main/java/week_9/java_lessons/output.txt");
        byte[] greetingInBytes = new byte[]{72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100};
        os.write(greetingInBytes);
        os.flush();

        Writer writer = new FileWriter("src/main/java/week_9/java_lessons/output_writer.txt");
        writer.write("Privet mir");
        os.flush();

        // IF you write, then you need to flush it.
    }
}
