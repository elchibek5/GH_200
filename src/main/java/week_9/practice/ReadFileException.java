package week_9.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileException {
    void readFile(String filename) throws FileNotFoundException {
        FileReader in = new FileReader(filename);
        BufferedReader br = new BufferedReader(in);

        try {
            String s = br.readLine();
            System.out.println(s);
        } catch (IOException e) {
            System.out.println("some IO error occured");
        }
    }
}
