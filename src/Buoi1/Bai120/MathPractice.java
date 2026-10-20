package Bai120;
/**
* Bài thực hành lớp Math và JavaDoc.
*/
public class MathPractice {
    private static final double EPSILON = 1e-9;
    /**
    * Giải phương trình bậc hai ax^2 + bx + c = 0.
    *
    * @param a hệ số bậc hai
    * @param b hệ số bậc một
    * @param c hệ số tự do
    * @return chuỗi mô tả nghiệm của phương trình
    */
    public static String solveQuadratic(double a, double b, double c) {
    if (Math.abs(a) < EPSILON) { // a == 0 -> bậc nhất bx + c = 0
    if (Math.abs(b) < EPSILON) {
    return Math.abs(c) < EPSILON ? "Vô số nghiệm" : "Vô nghiệm";
    }
    return "Nghiệm x = " + (-c / b);
    }
    double delta = b * b - 4 * a * c;
    if (delta < 0) return "Vô nghiệm thực";
    if (Math.abs(delta) < EPSILON) return "Nghiệm kép x = " + (-b / (2 * a));
    double sqrtDelta = Math.sqrt(delta);
    double x1 = (-b + sqrtDelta) / (2 * a);
    double x2 = (-b - sqrtDelta) / (2 * a);
    return String.format("x1 = %.4f, x2 = %.4f", x1, x2);
    }
    /**
    * Sinh số nguyên ngẫu nhiên trong đoạn [min, max].
    *
    * @param min cận dưới (bao gồm)
    * @param max cận trên (bao gồm)
    * @return số ngẫu nhiên trong đoạn
    * @throws IllegalArgumentException nếu min lớn hơn max
    */
    public static int randomInRange(int min, int max) {
    if (min > max) throw new IllegalArgumentException("min > max");
    return min + (int) (Math.random() * (max - min + 1));
    }
    public static void main(String[] args) {
    System.out.println(solveQuadratic(1, -3, 2));
    System.out.println(solveQuadratic(1, 2, 1));
    System.out.println(solveQuadratic(1, 0, 1));
    System.out.println(solveQuadratic(0, 2, -4));
    System.out.println(solveQuadratic(0, 0, 0));
    int lo = Integer.MAX_VALUE, hi = Integer.MIN_VALUE;
    for (int i = 0; i < 10_000; i++) {
    int r = randomInRange(1, 6);
    lo = Math.min(lo, r);
    hi = Math.max(hi, r);
    }
    System.out.println("Xúc xắc: min = " + lo + ", max = " + hi);
    System.out.println(Math.pow(2, 10) + " " + Math.ceil(4.1) + " " + Math.floor(-4.1));
    }
    }
