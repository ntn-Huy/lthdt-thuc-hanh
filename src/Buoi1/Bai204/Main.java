package Bai204;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("SV01", "An", 3.2);
        Student s2 = new Student("SV01", "Nguyen Van An", 3.2);

        System.out.println(s1);
        System.out.println("s1 == s2       : " + (s1 == s2));
        System.out.println("s1.equals(s2)  : " + s1.equals(s2));
        System.out.println("hash bang nhau: " + (s1.hashCode() == s2.hashCode()));

        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println("So SV trong set: " + set.size());
    }
}
