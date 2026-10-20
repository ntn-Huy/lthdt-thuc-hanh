package Bai114;
public class NameUtils {
    public static String normalizeName(String raw) {
    if (raw == null || raw.isBlank()) return "";
    String[] words = raw.trim().toLowerCase().split("\\s+");
    StringBuilder sb = new StringBuilder();
    for (String w : words) {
    sb.append(Character.toUpperCase(w.charAt(0)))
    .append(w.substring(1))
    .append(' ');
    }
    return sb.toString().trim();
    }
    public static String firstName(String normalized) {
    int lastSpace = normalized.lastIndexOf(' ');
    return lastSpace < 0 ? normalized : normalized.substring(lastSpace + 1);
    }
    public static String buildEmail(String normalized) {
    String[] parts = normalized.toLowerCase().split(" ");
    StringBuilder sb = new StringBuilder(parts[parts.length - 1]).append('.');
    for (int i = 0; i < parts.length - 1; i++) sb.append(parts[i].charAt(0));
    return sb.append("@st.example.edu.vn").toString();
    }
    public static void main(String[] args) {
    String name = normalizeName(" nGUyễn vĂn an ");
    System.out.println("[" + name + "]");
    System.out.println("Tên: " + firstName(name));
    System.out.println("Email: " + buildEmail(name));
    System.out.println("[" + normalizeName(null) + "]");
    }
    }