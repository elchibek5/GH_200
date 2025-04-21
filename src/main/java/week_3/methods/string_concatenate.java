package week_3.methods;

public class string_concatenate {
    public static String concatenate(String string, int num) {
        return string + num;
    }

    public static void main(String[] args) {
        System.out.println(concatenate("Hello ", 45));
    }
}
