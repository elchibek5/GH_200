package week_5.interfaces;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;  // Formula for area of a triangle: 0.5 * base * height
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle...");
    }

    @Override
    public void print() {
        System.out.println("Printing Triangle...");
    }
}
