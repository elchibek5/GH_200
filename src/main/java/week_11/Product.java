package week_11;

import java.math.BigDecimal;

public class Product {
    private String name;
    private String category;
    private BigDecimal price;

    public Product(String name, String category, BigDecimal price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String category() {
        return category;
    }

    public BigDecimal price() {
        return price;
    }

    public String getName() {
        return name;
    }
}
