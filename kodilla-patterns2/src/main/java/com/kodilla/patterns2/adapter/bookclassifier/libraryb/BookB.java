package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

public class BookB {

    private final String author;
    private final String title;
    private final int yearodPublication;

    public BookB(final String author, final String title, final int yearodPublication) {
        this.author = author;
        this.title = title;
        this.yearodPublication = yearodPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearodPublication() {
        return yearodPublication;
    }
}
