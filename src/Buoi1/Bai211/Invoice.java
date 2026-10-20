package Bai211;

public class Invoice {
    private static final int MAX_ITEMS = 50;
    private final String title;
    private final String[] lines = new String[MAX_ITEMS];
    private int lineCount;
    private long subtotal;
    private int discountPercent;

    public Invoice(String title) {
        this.title = title;
    }

    public Invoice addItem(String name, int qty, long unitPrice) {
        lines[lineCount++] = String.format("%-10s x%-3d %,12d", name, qty, qty * unitPrice);
        subtotal += qty * unitPrice;
        return this;
    }

    public Invoice discountPercent(int percent) {
        this.discountPercent = percent;
        return this;
    }

    public long getTotal() {
        return subtotal - subtotal * discountPercent / 100;
    }

    public void print() {
        System.out.println("== " + title + " ==");
        for (int i = 0; i < lineCount; i++) System.out.println(lines[i]);
        System.out.printf("Giam %d%% -> TONG: %,d d%n", discountPercent, getTotal());
    }
}
