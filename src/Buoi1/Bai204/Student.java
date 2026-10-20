package Bai204;

import java.util.Objects;

public class Student {
    private final String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        Objects.requireNonNull(id, "id null");
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() { return id; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', gpa=" + gpa + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
