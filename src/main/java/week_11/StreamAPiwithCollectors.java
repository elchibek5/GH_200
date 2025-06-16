package week_11;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPiwithCollectors {
    static class Person {
        private final String name;
        private final int age;
        private final String city;

        public Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
        public String getCity() { return city; }

        @Override
        public String toString() {
            return String.format("Person{name='&s', age=%d, city='%s'}", name, age, city);
        }
    }

    public static Map<String, Double> calculateAverageAgeByCity(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(
                        Person::getCity,
                        Collectors.averagingInt(Person::getAge)
                ));
    }
}
