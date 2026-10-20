package Bai215;

public class Main {
    public static void main(String[] args) {
        String[] ch = {"Mo dau", "Lop", "Doi tuong"};
        ImmutableBook book = new ImmutableBook("Java Guide", "Author A", "123", 2023, ch);
        ImmutableBook updated = book.withTitle("Advanced Java Guide");

        ch[0] = "BI SUA";
        System.out.println(book);
        System.out.println(updated);
    }
}
