package Bai1C;

public class Q11 {
    private int stock = 10;
    void sell() { stock--; }

    public static void main(String[] args) {
        // sell(); // LOI BIEN DICH
        // System.out.println(stock); // LOI BIEN DICH

        Q11 s = new Q11();
        s.sell();
        System.out.println(s.stock);
    }
}
