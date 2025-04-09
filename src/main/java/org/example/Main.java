package org.example;


public class Main {
    public static void main(String[] args) {

        String[] months = new String[] {
                "Jan",
                "Feb",
                "Mar",
                "Apr",
                "May",
                "June",
                "July",
                "Aug",
                "Sep",
                "Nov",
                "Dec",
        };
        int i = 0;

        do {
            System.out.println(months[i]);
            i++;
        } while (i < months.length);

    }
}