package Bai209;

public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        if (age < 0) throw new IllegalArgumentException("Tuoi am");
        if (gpa < 0 || gpa > 4) throw new IllegalArgumentException("GPA ngoai [0,4]");
        this.name = (name == null || name.isBlank()) ? "Unknown" : name.trim();
        this.age = age;
        this.gpa = gpa;
    }

    public Student(String name, int age) { this(name, age, 0.0); }
    public Student(String name) { this(name, 0); }
    public Student() { this("Unknown"); }

    @Override
    public String toString() {
        return String.format("%s (%d tuoi, GPA %.2f)", name, age, gpa);
    }
}
