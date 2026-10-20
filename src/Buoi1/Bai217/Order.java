package Bai217;

public class Order {
    public static final String PREFIX = "ORD-";
    private static int nextNumber = 1;
    private static int totalOrders = 0;

    private final String id;
    private final long amount;

    public Order(long amount) {
        this.id = PREFIX + String.format("%04d", nextNumber++);
        this.amount = amount;
        totalOrders++;
    }

    public static int getTotalOrders() { return totalOrders; }
    public String getId() { return id; }
}
