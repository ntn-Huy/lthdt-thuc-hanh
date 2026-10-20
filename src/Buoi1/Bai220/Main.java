package Bai220;

public class Main {
    public static void main(String[] args) {
        StudentManager lopA = new StudentManager("DHKTPM19A");
        StudentManager lopB = new StudentManager("DHKTPM19B");

        lopA.addStudent(new Student("SV001", "Nguyen Van An", 20, 3.2));
        lopA.addStudent(new Student("SV002", "Tran Thi Binh", 19, 3.8));

        lopB.addStudent(new Student("SV101", "Le Chi", 22, 2.9));

        lopA.displayAllStudents();
        lopB.displayAllStudents();
    }
}
