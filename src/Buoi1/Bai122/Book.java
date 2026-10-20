package Bai122;

public class Book {
    private String id;
    private String title;
    private String author;
    private int publishYear;
    private int availableQuantity;

    public Book(String id, String title, String author, int publishYear, int availableQuantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.availableQuantity = availableQuantity;
    }

    public boolean isAvailable() { return availableQuantity > 0; }
    public void decreaseQuantity() { if (availableQuantity > 0) availableQuantity--; }
    public void increaseQuantity() { availableQuantity++; }

    @Override
    public String toString() {
        return id + " - " + title + " (" + author + ", " + publishYear + ") | Con: " + availableQuantity;
    }
}
