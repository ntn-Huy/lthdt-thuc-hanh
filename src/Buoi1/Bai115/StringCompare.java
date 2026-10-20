package Bai115;
public class StringCompare {
    public static void main(String[] args) {
    String a = "Java";
    String b = "Java";
    String c = new String("Java");
    String d = "Ja" + "va"; // hằng lúc biên dịch
    String part = "Ja";
    String e = part + "va"; // tính lúc chạy
    System.out.println(a == b); // (1)
    System.out.println(a == c); // (2)
    System.out.println(a.equals(c)); // (3)
    System.out.println(a == d); // (4)
    System.out.println(a == e); // (5)
    System.out.println(a == e.intern()); // (6)
    int n = 50_000;
    long t = System.nanoTime();
    String s = "";
    for (int i = 0; i < n; i++) s += i;
    long plusMs = (System.nanoTime() - t) / 1_000_000;
    t = System.nanoTime();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) sb.append(i);

    long sbMs = (System.nanoTime() - t) / 1_000_000;
    System.out.println("Độ dài bằng nhau: " + (s.length() == sb.length()));
    System.out.println("+= : " + plusMs + " ms | StringBuilder: " + sbMs + " ms");
    }
    }