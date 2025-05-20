package week_9.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileException {
    void readFile(String filename) throws FileNotFoundException {
        FileReader in = new FileReader(filename);
        BufferedReader br = new BufferedReader(in);
        br.readLine();
    }
}
