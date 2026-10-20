package Bai118;
import java.util.Objects;
public class NullSafety {
static String getRoleFromDatabase() { return null; }
static void printRoleLength(String role) {
Objects.requireNonNull(role, "role không được null"); // thất bại sớm, thông báo rõ
System.out.println(role.length());
}
public static void main(String[] args) {
String role = getRoleFromDatabase();
if (role != null && role.equals("admin")) System.out.println("Cách 1: admin");
if ("admin".equals(role)) System.out.println("Cách 2: admin");
if (Objects.equals(role, "admin")) System.out.println("Cách 3: admin");
String safeRole = Objects.requireNonNullElse(role, "guest");
System.out.println("Vai trò: " + safeRole);
try {
printRoleLength(role);
} catch (NullPointerException e) {
System.out.println("Lỗi: " + e.getMessage());
}
}
}