package Bai1C;

public class Q14 {
    static class Config {
        static int loaded = 0;
        static {
            loaded++;
            System.out.println("Config loaded " + loaded);
        }
        static final String VERSION = "1.0";
        static String name() { return "APP"; }
    }

    public static void main(String[] args) {
        System.out.println("start");
        System.out.println(Config.VERSION);
        System.out.println(Config.name());
        System.out.println(Config.name());
    }
}
