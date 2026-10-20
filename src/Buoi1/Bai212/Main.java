package Bai212;

public class Main {
    public static void main(String[] args) {
        Product p = new Product("LAP-0001", "Laptop Pro 14", 25000000, 3);
        p.addTag("Laptop");
        p.addTag("Van phong");
        System.out.println(p);
        System.out.println("Tong gia tri kho: " + p.getTotalValue());
    }
}
