package Bai107;
import java.util.Scanner;
public class LoopPractice {
public static void main(String[] args) {
// 1. Số nguyên tố < 50
for (int n = 2; n < 50; n++) {
boolean isPrime = true;
    for (int d = 2; d * d <= n; d++) {
    if (n % d == 0) {
    isPrime = false;
    break; // tìm thấy ước -> thoát vòng trong
    }
    }
    if (!isPrime) continue; // bỏ qua, sang n kế tiếp
    System.out.print(n + " ");
    }
    System.out.println();
    // 2. do-while kiểm tra dữ liệu
    Scanner sc = new Scanner(System.in);
    
    int rows;
    do {
    System.out.print("Nhập số dòng (1-9): ");
    rows = sc.nextInt();
    } while (rows < 1 || rows > 9);
    for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= i; j++) {
    System.out.print(j);
    }
    System.out.println();
    }
}
}