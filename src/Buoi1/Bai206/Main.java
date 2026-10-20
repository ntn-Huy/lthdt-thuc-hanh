package Bai206;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.selfTest();
        System.out.println(p.packageInfo + " | " + p.familyInfo + " | " + p.publicInfo);
    }
}
