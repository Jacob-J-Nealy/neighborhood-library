package com.pluralsight;

import static com.pluralsight.NeighborhoodLibrary.bookTracker;
import static com.pluralsight.NeighborhoodLibrary.books;

public class Book {

    // Book Properties
    private int id;
    private String isbn;
    private boolean isCheckedout;
    private String  checkedOutTo;

    // Book Constructor
    public Book(int id, String isbn, boolean isCheckedout, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.isCheckedout = isCheckedout;
        this.checkedOutTo = checkedOutTo;
    }

    // Book toString
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", isCheckedout=" + isCheckedout +
                ", checkedOutTo='" + checkedOutTo + '\'' +
                '}';
    }

    // Methods
    public static void checkOut() {

    }

    public static void checkIn() {

    }


    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //_____________________________________________

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
}
