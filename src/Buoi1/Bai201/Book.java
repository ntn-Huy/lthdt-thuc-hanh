package Bai201;

public class Book {
    String title;
    String author;
    double price;
    int pages;

    void display() {
        System.out.printf("'%s' | %s | %.0f d | %d trang%n", title, author, price, pages);
    }

    void applyDiscount(double percent) {
        price = price * (1 - percent / 100);
    }

    boolean isThick() {
        return pages > 300;
    }
}
