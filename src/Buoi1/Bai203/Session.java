package Bai203;

public class Session {
    static int created = 0;
    private final byte[] payload = new byte[1024];

    Session() {
        created++;
    }
}
