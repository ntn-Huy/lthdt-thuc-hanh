package Bai1C;

public class Q2 {
    static void shout(String s) {
        s.toUpperCase();
        s = s + "!";
    }

    static void shout(StringBuilder sb) {
        sb.append("!");
        sb = new StringBuilder("NEW");
    }

    public static void main(String[] args) {
        String s = "hello";
        s.toUpperCase();
        shout(s);
        System.out.println(s);

        StringBuilder sb = new StringBuilder("hello");
        shout(sb);
        System.out.println(sb);
    }
}
