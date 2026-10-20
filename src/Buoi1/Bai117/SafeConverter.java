package Bai117;
public class SafeConverter {
    public static int parseIntOrDefault(String s, int defaultValue) {
    if (s == null) return defaultValue;
    try {
    return Integer.parseInt(s.trim());
    } catch (NumberFormatException e) {
    return defaultValue;
    }
    }
    public static void main(String[] args) {
    String[] inputs = {"123", " 45 ", "12a", "", null, "99999999999"};
    for (String in : inputs) {
    System.out.println("[" + in + "] -> " + parseIntOrDefault(in, -1));
    }
    // ===== Khối bẫy =====
    double d = 9.99;
    int i = (int) d;
    System.out.println(i); // (1)
    System.out.println((int) -9.99); // (2)
    System.out.println(Math.round(9.5) + " " + Math.round(-9.5)); // (3)
    int big = (int) 3_000_000_000L;
    System.out.println(big); // (4)
    System.out.println(Integer.MAX_VALUE + 1); // (5)
    Integer x1 = 127, x2 = 127, y1 = 128, y2 = 128;
    System.out.println(x1 == x2); // (6)
    System.out.println(y1 == y2); // (7)
    System.out.println(y1.equals(y2)); // (8)
    Integer maybe = null;
    try {
    int value = maybe; // (9) unboxing null
    System.out.println(value);
    } catch (NullPointerException e) {
    System.out.println("NPE khi unboxing null");
    }
    }
    }