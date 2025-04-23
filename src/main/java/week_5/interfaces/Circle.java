package week_5.interfaces;

public class Circle implements Drawable, Printable{


    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
    }

    @Override
    public void print() {
        System.out.println("Printing Circle...");
    }
}
