package Bai1C;

public class Q7 {
    static class Student {
        private String name;
        private int age;

        Student(String name, int age) {
            name = name;
            this.age = age;
        }

        String info() { return name + " " + age; }
    }

    public static void main(String[] args) {
        System.out.println(new Student("Lan", 20).info());
    }
}
