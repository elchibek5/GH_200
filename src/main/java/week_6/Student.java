package week_6;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String name() {
        return name;
    }

    @Override
    public int compareTo(@NotNull Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

