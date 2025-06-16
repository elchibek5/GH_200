package week_11;

import java.util.Comparator;
import java.util.List;

public class ComparatorAndCollections {
    record Student(String name, double grade, int age) {

        @Override
        public String toString() {
            return String.format("Student{name='%s', grade=%.1f), age=%d}", name, grade, age);
        }
    }

    public static void sortStudents(List<Student> students) {
        students.sort(
                Comparator.comparingDouble(Student::grade).reversed()
                        .thenComparingInt(Student::age)
        );
    }
}
