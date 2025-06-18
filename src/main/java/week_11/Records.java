package week_11;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Records {
    public static List<Product> findProductsByCategory(List<Product> products, String category) {
        return products.stream()
                .filter(p -> p.category().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public static BigDecimal calculateTotalValue(List<Product> products) {
        return products.stream()
                .map(Product::price)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static Map<String, List<Product>> groupProductByCategory(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::category));
    }
}
