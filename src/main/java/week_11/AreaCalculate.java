package week_11;

import week_5.interfaces.Shape;
import week_5.interfaces.Circle;
import week_5.interfaces.Rectangle;
import week_5.interfaces.Triangle;

import java.util.List;

public class AreaCalculate {
    public static double calculateTotalArea(List<Shape> shapes) {
        return shapes.stream()
                .mapToDouble(shape -> {
                    if (shape instanceof Circle c) {
                        return c.area();
                    } else if (shape instanceof Rectangle r) {
                        return r.area();
                    } else if (shape instanceof Triangle t) {
                        return t.area();
                    } else {
                        throw new IllegalArgumentException("Unknown shape type");
                    }
                })
                .sum();
    }
}
