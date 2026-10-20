package Bai126;

/**
 * Tien ich chuyen doi nhiet do giua do C va do F.
 */
public class Temperature {
    /** Do khong tuyet doi theo thang Celsius. */
    public static final double ABSOLUTE_ZERO_C = -273.15;

    /**
     * Chuyen do C sang do F theo cong thuc F = C * 9/5 + 32
     * @param celsius nhiet do do C, khong nho hon ABSOLUTE_ZERO_C
     * @return nhiet do tuong ung theo do F
     * @throws IllegalArgumentException neu nhiet do nho hon do khong tuyet doi
     */
    public static double toFahrenheit(double celsius) {
        if (celsius < ABSOLUTE_ZERO_C) {
            throw new IllegalArgumentException("Nho hon do khong tuyet doi");
        }
        // Dung 9.0 thay vi 9: neu viet 9 / 5 se la phep chia nguyen = 1
        return celsius * 9.0 / 5 + 32;
    }

    /**
     * Chuyen do F sang do C.
     * @param fahrenheit nhiet do do F
     * @return nhiet do tuong ung theo do C
     */
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9.0;
    }

    public static void main(String[] args) {
        System.out.println(toFahrenheit(100) + " " + toCelsius(98.6));
    }
}
