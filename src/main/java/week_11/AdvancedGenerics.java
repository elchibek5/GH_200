package week_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AdvancedGenerics {
    static class MinMaxFinder<T extends Comparable<T>> {
        private final List<T> elements = new ArrayList<>();

        public void add(T element) {
            if (element != null) {
                elements.add(element);
            }
        }

        public Optional<T> getMin() {
            return elements.stream().min(Comparable:: compareTo);
        }

        public Optional<T> getMax() {
            return elements.stream().max(Comparable::compareTo);
        }

        public int size() {
            return elements.size();
        }

        public void clear() {
            elements.clear();
        }

        public List<T> getElements() {
            return new ArrayList<>(elements);
        }
    }
}
