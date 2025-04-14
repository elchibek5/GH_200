package org.example;

public class average_finder {
    public static void main(String[] args) {
        System.out.println("Average finder");
        double avg = findAverage(args);
        System.out.println("The avergae is " + avg);
    }

    static double findAverage(String[] input) {
        double result = 0;
        if (input.length == 0) {
            return result;
        }

        for (String s: input) {
            result += Integer.parseInt(s); // Converts Strings to in
        }
        return result/ input.length;
    }
}
