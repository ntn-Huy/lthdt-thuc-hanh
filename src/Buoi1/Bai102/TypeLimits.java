package Bai102;
public class TypeLimits {
    static final int MAX_STUDENTS = 60;
    public static void main(String[] args) {
    System.out.println("byte : " + Byte.MIN_VALUE + " .. " + Byte.MAX_VALUE);
    System.out.println("short : " + Short.MIN_VALUE + " .. " + Short.MAX_VALUE);
    System.out.println("int : " + Integer.MIN_VALUE + " .. " + Integer.MAX_VALUE);
    System.out.println("long : " + Long.MIN_VALUE + " .. " + Long.MAX_VALUE);
    System.out.println("float : " + Float.MIN_VALUE + " .. " + Float.MAX_VALUE);
    System.out.println("double : " + Double.MIN_VALUE + " .. " + Double.MAX_VALUE);
    System.out.println("char : " + (int) Character.MIN_VALUE + " .. " + (int)Character.MAX_VALUE);
    long population = 8_100_000_000L; // dấu _ giúp dễ đọc (Java 7+)
    float pi = 3.14f; // thiếu f -> lỗi: double không tự thu hẹp thành

    char grade = 'A';
    boolean passed = true;
    System.out.println(population + " " + pi + " " + grade + " " + passed);
    System.out.println("Sĩ số tối đa: " + MAX_STUDENTS);
    // MAX_STUDENTS = 70; // LỖI BIÊN DỊCH: cannot assign a value to final variable
    }
}