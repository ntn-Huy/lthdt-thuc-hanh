package Bai218;

public final class ValidationUtils {
    private ValidationUtils() {
        throw new AssertionError("Khong tao doi tuong lop tien ich");
    }

    public static boolean isBlank(String s) {
        return s == null || s.isBlank();
    }

    public static boolean isValidEmail(String email) {
        return !isBlank(email) && email.matches("[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+");
    }

    public static boolean isValidPhoneVN(String phone) {
        return !isBlank(phone) && phone.matches("0\\d{9}");
    }
}
