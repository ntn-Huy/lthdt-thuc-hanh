package Bai203;

public class LifecycleDemo {
    static long usedMemoryKb() {
        Runtime rt = Runtime.getRuntime();
        return (rt.totalMemory() - rt.freeMemory()) / 1024;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000; i++) {
            Session s = new Session();
        }

        System.out.println("Da tao: " + Session.created + " doi tuong (~1 GB du lieu)");
        System.out.println("Bo nho truoc gc: " + usedMemoryKb() + " KB");
        System.gc();
        System.out.println("Bo nho sau gc  : " + usedMemoryKb() + " KB");
    }
}
