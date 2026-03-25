package com.linkcode.Home;

public class bookmanagement{
    String bookName;
    String author;
    int pages;
    int price;

    public bookmanagement(String bookName, String author, int pages, int price) {
        this.bookName = bookName;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Price: " + price);
    }
}





