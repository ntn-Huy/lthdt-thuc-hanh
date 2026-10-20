package Buoi1.Phan2.P01_Library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

record BookInfo(String isbn, String title, String author, int publishYear) {
    public BookInfo {
        if (isbn == null || !isbn.matches("\\d{13}")) {
            throw new IllegalArgumentException("ISBN phai dung 13 chu so");
        }
        if (publishYear < 1900 || publishYear > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Nam xuat ban khong hop le");
        }
    }
}

class Book {
    private final BookInfo info;
    private final int totalCopies;
    private int availableCopies;

    public Book(BookInfo info, int totalCopies) {
        if (totalCopies <= 0) throw new IllegalArgumentException("So ban in phai > 0");
        this.info = info;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    public boolean checkout() {
        if (availableCopies > 0) {
            availableCopies--;
            return true;
        }
        return false;
    }

    public void checkin() {
        if (availableCopies < totalCopies) availableCopies++;
    }

    public BookInfo getInfo() { return info; }
    public int getAvailableCopies() { return availableCopies; }
}

public class Main {
    public static void main(String[] args) {
        BookInfo info = new BookInfo("9781234567890", "Lap trinh Java", "Tac gia A", 2023);
        Book book = new Book(info, 2);
        
        System.out.println("Muon lan 1: " + book.checkout());
        System.out.println("Muon lan 2: " + book.checkout());
        System.out.println("Muon lan 3: " + book.checkout()); // False do het sach
        System.out.println("Con lai: " + book.getAvailableCopies());
    }
}
