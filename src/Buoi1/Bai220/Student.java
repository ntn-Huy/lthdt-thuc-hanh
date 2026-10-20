package Bai220;

import java.util.Objects;

public class Student {
    private final String id;
    private String name;
    private int age;
    private double gpa;

    public Student(String id, String name, int age, double gpa) {
        if (id == null || !id.matches("SV\\d{3}")) {
            throw new IllegalArgumentException("Ma SV phai dang SVxxx: " + id);
        }
        this.id = id;
        setName(name);
        setAge(age);
        setGpa(gpa);
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }

    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Ten rong");
        this.name = name.trim();
    }

    public void setAge(int age) {
        if (age < 16 || age > 60) throw new IllegalArgumentException("Tuoi ngoai pham vi");
        this.age = age;
    }

    public void setGpa(double gpa) {
        if (gpa < 0 || gpa > 4.0) throw new IllegalArgumentException("GPA ngoai [0,4]");
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return id.equals(((Student) o).id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return String.format("%-6s %-20s %3d %5.2f", id, name, age, gpa);
    }
}
