package Bai113;
import java.util.Scanner;
public class InputForm {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Tuổi: ");
while (!sc.hasNextInt()) { // dữ liệu không phải số nguyên
System.out.print("Vui lòng nhập SỐ NGUYÊN. Tuổi: ");
sc.next(); // bỏ token sai
}
int age = sc.nextInt();
sc.nextLine(); // nuốt ký tự Enter còn sót
System.out.print("Họ tên: ");
String fullName = sc.nextLine().trim();
System.out.print("Điểm: ");
double score = Double.parseDouble(sc.nextLine().trim());
System.out.printf("%-20s|%5s|%6s%n", "Họ tên", "Tuổi", "Điểm");
System.out.printf("%-20s|%5d|%6.2f%n", fullName, age, score);
}
}