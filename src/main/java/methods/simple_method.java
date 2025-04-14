package methods;

public class simple_method {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static String string_method(String name, String surname) {
        return "Hello " + name + " " + surname;
    }

    public static void main(String[] args) {
        System.out.println(sum(4.0,5.2));
        System.out.println(string_method("Elchibek", "Dastanov"));
    }
}
