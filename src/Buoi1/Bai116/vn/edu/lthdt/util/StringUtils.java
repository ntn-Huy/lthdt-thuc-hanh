package Bai116.vn.edu.lthdt.util;
public class StringUtils {
    public static boolean isBlank(String s) {
    return s == null || s.trim().isEmpty();
    }
    public static String capitalize(String s) {
    if (isBlank(s)) return s;
    return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
    }