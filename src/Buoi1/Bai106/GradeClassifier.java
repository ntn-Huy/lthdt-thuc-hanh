package Bai106;
import java.util.Scanner;
public class GradeClassifier {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập điểm (0-10): ");
    double score = sc.nextDouble();
    if (score < 0 || score > 10) { // guard clause
    System.out.println("Điểm không hợp lệ!");
    return;
    }
    char letter;
    if (score >= 8.5) letter = 'A';
    else if (score >= 7.0) letter = 'B';
    else if (score >= 5.5) letter = 'C';
    else if (score >= 4.0) letter = 'D';
    else letter = 'F';
    String comment = switch (letter) { // switch expression (Java 14+)
    case 'A' -> "Giỏi";
    case 'B' -> "Khá";
    case 'C' -> "Trung bình";
    case 'D' -> "Trung bình yếu";
    default -> "Không đạt";
    };
    System.out.println("Điểm chữ: " + letter + " - " + comment);
    }
}
