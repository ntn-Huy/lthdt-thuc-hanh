package Bai211;

public class Main {
    public static void main(String[] args) {
        Invoice inv = new Invoice("HD 0001")
                .addItem("Ban phim", 2, 350000)
                .addItem("Chuot", 3, 150000)
                .discountPercent(10);
        inv.print();
    }
}
