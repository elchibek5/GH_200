package week_6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    void treeSet() {

        Set<Integer> set = new TreeSet<>();
        set.add(100);
        set.add(300);
        set.add(40);
        for (int value : set) {
            System.out.println(value);
        }
        set.remove(300);
        set.contains(100);
    }

    void customClass() {
        Set<Student> students = new TreeSet<>();
        students.add(new Student("Elchibek"));
        students.add(new Student("Misha"));
        for (Student student : students) {
                System.out.println(student.getName());
        }
        System.out.println(students.contains(new Student("Eric")));
    }

    void hashSet() {
        Set<Integer> hashSet = new HashSet<>();
    }
}
