package Bai112;
public class Fibonacci {
    static long fibRecursive(int n) {
    if (n <= 1) return n; // điều kiện dừng
    return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
    static long fibLoop(int n) {
    long prev = 0, curr = 1;
    if (n == 0) return 0;
    for (int i = 2; i <= n; i++) {
    long next = prev + curr;
    prev = curr;
    curr = next;
    }
    return curr;
    }
    public static void main(String[] args) {
    int n = 40;
    long t1 = System.nanoTime();
    long a = fibRecursive(n);
    long t2 = System.nanoTime();
    long b = fibLoop(n);
    long t3 = System.nanoTime();
    System.out.println("Đệ quy : " + a + " - " + (t2 - t1) / 1_000_000 + " ms");
    System.out.println("Vòng lặp: " + b + " - " + (t3 - t2) / 1_000 + " µs");
    }
    }
