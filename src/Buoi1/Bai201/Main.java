package Bai201;

public class Main {
    public static void main(String[] args) {
        Book empty = new Book();
        empty.display();

        Book b1 = new Book();
        b1.title = "Clean Code";
        b1.author = "Robert C. Martin";
        b1.price = 350000;
        b1.pages = 464;

        Book b2 = new Book();
        b2.title = "Java co ban";
        b2.author = "Nhom tac gia";
        b2.price = 120000;
        b2.pages = 250;

        b1.applyDiscount(20);
        b1.display();
        b2.display();

        System.out.println("b1 day? " + b1.isThick() + " | b2 day? " + b2.isThick());
    }
}
