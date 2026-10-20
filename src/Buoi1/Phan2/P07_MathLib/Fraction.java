package Phan2.P07_MathLib;

public record Fraction(long num, long den) {
    public Fraction {
        if (den == 0) throw new ArithmeticException("Mau so khong the bang 0");
        long g = gcd(Math.abs(num), Math.abs(den));
        num = num / g;
        den = den / g;
        if (den < 0) {
            num = -num;
            den = -den;
        }
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public Fraction add(Fraction other) {
        return new Fraction(this.num * other.den + other.num * this.den, this.den * other.den);
    }

    @Override
    public String toString() {
        return den == 1 ? String.valueOf(num) : num + "/" + den;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        System.out.println("1/2 + 1/3 = " + f1.add(f2)); // 5/6
    }
}
