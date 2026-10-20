package Bai104;
public class OperatorTraps {
    public static void main(String[] args) {
    System.out.println(7 / 2); // (1)
    System.out.println(7 / 2.0); // (2)
    System.out.println(-7 % 3); // (3)
    System.out.println(1 + 2 + "3"); // (4)
    System.out.println("1" + 2 + 3); // (5)
    int i = 5;
    int j = i++ + ++i; // (6)
    System.out.println(i + " " + j);
    byte b = 10;
    b += 5; // (7) hợp lệ
    // b = b + 5; // (8) LỖI biên dịch
    System.out.println(b);
    int count = 0;
    boolean r = (count != 0) && (10 / count > 1); // (9)
    System.out.println(r);
    System.out.println(0.1 + 0.2 == 0.3); // (10)
    char c = 'A';
    System.out.println(c + 1); // (11)
    System.out.println((char) (c + 1)); // (12)
    }
}
