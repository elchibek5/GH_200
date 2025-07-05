package week_5.interfaces;

public class Circle implements Shape, Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;  // Formula for area of a circle: πr²
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
    }

    @Override
    public void print() {
        System.out.println("Printing Circle...");
    }
}
