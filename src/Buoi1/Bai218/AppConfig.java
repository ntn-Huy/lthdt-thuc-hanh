package Bai218;

public final class AppConfig {
    private static final String RAW = "app.name=QLSV; app.maxStudents=60";
    private static final String[] KEYS;
    private static final String[] VALUES;

    static {
        System.out.println("[static block] Dang nap cau hinh...");
        String[] pairs = RAW.split(";");
        KEYS = new String[pairs.length];
        VALUES = new String[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            String[] kv = pairs[i].split("=", 2);
            KEYS[i] = kv[0].trim();
            VALUES[i] = kv[1].trim();
        }
    }

    private AppConfig() { }

    public static String get(String key) {
        for (int i = 0; i < KEYS.length; i++) {
            if (KEYS[i].equals(key)) return VALUES[i];
        }
        return null;
    }

    public static int getInt(String key, int defaultValue) {
        String v = get(key);
        try {
            return v == null ? defaultValue : Integer.parseInt(v);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }
}
