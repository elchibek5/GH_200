package week_5.interfaces;

public class Paint {
    public static void main(String[] args) {
        // Provide the radius as an argument when creating the Circle object
        Drawable c = new Circle(5.0); // Example radius of 5.0
        c.draw();
        c.print();
    }
}
