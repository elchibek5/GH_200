package week_6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    void treeMap() {
        Map<String, Integer> scores = new TreeMap<>(); // TreeMap sorts
        scores.put("Iliiaz", 10);
        scores.put("Rusya", 20);
//          0(log(N)) time complexity
        System.out.println(scores.get("Rusya"));
    }

    void hashMap() {
        Map<String, Integer> scores = new HashMap<>();
//        0(1) time complexity
        scores.put("Iliiaz", 10);
        scores.put("Rusya", 20);

        System.out.println(scores.get("Rusya"));
    }
}
