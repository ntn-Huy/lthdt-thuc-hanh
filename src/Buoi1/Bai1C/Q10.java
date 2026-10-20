package Bai1C;

public class Q10 {
    public static void main(String[] args) {
        Integer a = 1000;
        int b = 1000;
        Integer c = 1000;

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        Long big = 1000L;
        System.out.println(big.equals(1000));
    }
}
