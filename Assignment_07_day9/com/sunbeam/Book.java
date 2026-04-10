package com.sunbeam;

class Book {
    String isbn;
    double price;
    String authorName;
    int quantity;

    public Book(String isbn, double price, String authorName, int quantity) {
        this.isbn = isbn;
        this.price = price;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    public String toString() {
        return "ISBN: " + isbn + ", Price: " + price + ", Author: " + authorName + ", Quantity: " + quantity;
    }
}