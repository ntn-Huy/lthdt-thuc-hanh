package Bai101;
public class StudentCard {
    public static void main(String[] args) {
    String name = args.length >= 1 ? args[0] : "Nguyen Van A";
    String id = args.length >= 2 ? args[1] : "23000001";
    String clazz = "DHKTPM19A";
    System.out.println("+--------------------------------+");
    System.out.println("| THE SINH VIEN |");
    System.out.println("+--------------------------------+");
    System.out.println("| Ho ten : " + name);
    System.out.println("| MSSV : " + id);
    System.out.println("| Lop : " + clazz);
    System.out.println("+--------------------------------+");
    }
}