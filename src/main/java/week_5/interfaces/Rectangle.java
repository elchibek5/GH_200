package week_5.interfaces;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;  // Formula for area of a rectangle: width * height
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle...");
    }

    @Override
    public void print() {
        System.out.println("Printing Rectangle...");
    }
}
