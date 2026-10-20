package Bai217;

public class Main {
    public static void main(String[] args) {
        Order o1 = new Order(500000);
        Order o2 = new Order(1200000);
        System.out.println(o1.getId() + " " + o2.getId());
        System.out.println("Tong so don: " + Order.getTotalOrders());
    }
}
