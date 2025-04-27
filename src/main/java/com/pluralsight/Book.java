package com.pluralsight;

import static com.pluralsight.NeighborhoodLibrary.bookTracker;
import static com.pluralsight.NeighborhoodLibrary.books;

public class Book {

    // Book Properties
    private int id;
    private String isbn;
    private boolean isCheckedout;
    private String  checkedOutTo;
    private String title;

    // Book Constructor
    public Book(int id, String isbn, String title, boolean isCheckedout, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedout = isCheckedout;
        this.checkedOutTo = checkedOutTo;
    }

    // to String
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", isCheckedout=" + isCheckedout +
                ", checkedOutTo='" + checkedOutTo + '\'' +
                ", title='" + title + '\'' +
                '}';
    }



    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public boolean isCheckedout() {
        return isCheckedout;
    }

    public void setCheckedout(boolean checkedout) {
        isCheckedout = checkedout;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
