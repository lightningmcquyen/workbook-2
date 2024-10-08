package com.pluralsight.library;

public class Book {

    //Instance variables
    private int id = 0;
    private String isbn = "";
    private String title = "";
    private String checkedOutTo = "";
    private boolean isCheckedOut = false;

    //Constructor
    public Book(int id, String isbn, String title, String checkedOutTo, boolean isCheckedOut){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.checkedOutTo = checkedOutTo;
        this.isCheckedOut = isCheckedOut;
    }

    public Book(){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.checkedOutTo = checkedOutTo;
        this.isCheckedOut = isCheckedOut;
    }

    // Getters & Setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCheckedOutTo() {
        return this.checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.isCheckedOut = checkedOut;
    }

    //Methods
    public String toString() {
        return "ID: " + this.id + "      ISBN: " + this.isbn + "      Title: " + this.title;
    }

        // Check-out
        public void checkOut(String name){
            isCheckedOut = true;
            checkedOutTo = name;
        }

        // Check-in
        public void checkIn() {
            isCheckedOut = false;
            checkedOutTo = "";
        }
    }

