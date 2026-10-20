package Bai213;

public class Main {
    public static void main(String[] args) {
        Person a = new Person("John", 25, "john@example.com");
        Person b = Person.of("John, 25, john@example.com");
        System.out.println(a);
        System.out.println("a.equals(b): " + a.equals(b));
    }
}
