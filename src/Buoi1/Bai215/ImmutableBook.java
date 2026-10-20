package Bai215;

import java.util.Arrays;

public final class ImmutableBook {
    private final String title;
    private final String author;
    private final String isbn;
    private final int publishedYear;
    private final String[] chapters;

    public ImmutableBook(String title, String author, String isbn, int publishedYear, String[] chapters) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishedYear = publishedYear;
        this.chapters = Arrays.copyOf(chapters, chapters.length);
    }

    public String getTitle() { return title; }
    public String[] getChapters() { return chapters.clone(); }

    public ImmutableBook withTitle(String newTitle) {
        return new ImmutableBook(newTitle, author, isbn, publishedYear, chapters);
    }

    @Override
    public String toString() {
        return title + " - " + author + " (" + publishedYear + ") " + Arrays.toString(chapters);
    }
}
