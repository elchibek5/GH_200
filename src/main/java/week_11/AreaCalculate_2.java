package week_11;

import week_5.interfaces.Circle;

import java.awt.*;

public class AreaCalculate_2 {
    public static double calculateTotalAreaTraditional(List<Shape> shapes) {
        double total = 0.0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                total += ((Circle) shape).area();
            } else if (shape instanceof Rectangle) {
                total += ((Rectangle) shape).area();
            } else if (shape instanceof Triangle) {
                total += ((Triangle) shape).area();
            }
        }
        return total;
    }
}
