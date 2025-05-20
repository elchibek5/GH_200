package week_9.practice;

public class main {
    public static void main(String[] args) {
        try {
            String s = null;
            s.charAt(7);
        } catch (NullPointerException a) {
            System.out.println("caught ME!");
        }
    }
}
