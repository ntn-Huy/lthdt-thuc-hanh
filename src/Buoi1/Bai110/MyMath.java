package Bai110;
public class MyMath {
    public static boolean isEven(int n) {
    return n % 2 == 0;
    } 
    public static long factorial(int n) {
    if (n < 0) throw new IllegalArgumentException("n phải >= 0");
    long result = 1;
    for (int i = 2; i <= n; i++) result *= i;
    return result;
    }
    public static int gcd(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    while (b != 0) {
    int r = a % b;
    a = b;
    b = r;
    }
    return a;
    }
    public static int max(int a, int b) { return a >= b ? a : b; }
    public static int max(int a, int b, int c) { return max(max(a, b), c); }
    public static double max(double a, double b) { return a >= b ? a : b; }
    public static void main(String[] args) {
    System.out.println(isEven(10) + " " + isEven(7));
    System.out.println("20! = " + factorial(20));
    System.out.println("gcd(84, 36) = " + gcd(84, 36));
    System.out.println(max(3, 9) + " " + max(3, 9, 5) + " " + max(2.5, 1.5));
    }
    }