package Bai220;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager {
    private final String className;
    private final List<Student> students = new ArrayList<>();

    public StudentManager(String className) {
        this.className = className;
    }

    public boolean addStudent(Student student) {
        if (student == null || students.contains(student)) return false;
        return students.add(student);
    }

    public boolean removeStudent(String id) {
        Student found = findStudentById(id);
        return found != null && students.remove(found);
    }

    public Student findStudentById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) return s;
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return Collections.unmodifiableList(students);
    }

    public double getAverageGpa() {
        if (students.isEmpty()) return 0;
        double sum = 0;
        for (Student s : students) sum += s.getGpa();
        return sum / students.size();
    }

    public void displayAllStudents() {
        System.out.println("=== Lop " + className + " (" + students.size() + " SV) ===");
        for (Student s : students) System.out.println(s);
        System.out.printf("GPA trung binh: %.2f%n", getAverageGpa());
    }
}
