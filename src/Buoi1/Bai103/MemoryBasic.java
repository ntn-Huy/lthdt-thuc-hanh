package Bai103;
public class MemoryBasic {
    public static void main(String[] args) {
    int a = 5;
    int b = a;
    b = 10;
    int[] x = {1, 2, 3};
    int[] y = x;
    y[0] = 100;
    String s1 = "Java";
    String s2 = s1;
    s2 = s2 + "!";
    System.out.println(a + " " + b);
    System.out.println(x[0] + " " + y[0]);
    System.out.println(s1 + " " + s2);
    }
}