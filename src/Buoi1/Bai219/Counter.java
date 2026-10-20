package Bai219;

public class Counter {
    static int sharedCount = 0;
    int ownCount = 0;

    void hit() {
        sharedCount++;
        ownCount++;
    }

    public static void main(String[] args) {
        Counter a = new Counter();
        Counter b = new Counter();

        a.hit(); 
        a.hit(); 
        b.hit();

        System.out.println(a.ownCount + " " + b.ownCount);
        System.out.println(a.sharedCount + " " + b.sharedCount + " " + Counter.sharedCount);

        Counter c = null;
        System.out.println(c.sharedCount); // Truy cap static qua null van hop le, khong NPE
    }
}
