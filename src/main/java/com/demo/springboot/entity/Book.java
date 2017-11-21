package com.demo.springboot.entity;

/**
 * Created by hzheng2 on 17-11-20.
 */
public class Book {
//    private int bookId;
//    private String bookName;
//    private double bookPrice;
//    private String bookAuthor;
//
//    public Book() {
//    }
//
//    public Book(int bookId, String bookName, double bookPrice, String bookAuthor) {
//        this.bookId = bookId;
//        this.bookName = bookName;
//        this.bookPrice = bookPrice;
//        this.bookAuthor = bookAuthor;
//    }
//
//    public int getBookId() {
//        return bookId;
//    }
//
//    public void setBookId(int bookId) {
//        this.bookId = bookId;
//    }
//
//    public String getBookName() {
//        return bookName;
//    }
//
//    public void setBookName(String bookName) {
//        this.bookName = bookName;
//    }
//
//    public double getBookPrice() {
//        return bookPrice;
//    }
//
//    public void setBookPrice(double bookPrice) {
//        this.bookPrice = bookPrice;
//    }
//
//    public String getBookAuthor() {
//        return bookAuthor;
//    }
//
//    public void setBookAuthor(String bookAuthor) {
//        this.bookAuthor = bookAuthor;
//    }
//
//    @Override public String toString() {
//        return "Book{" +
//            "bookId=" + bookId +
//            ", bookName='" + bookName + '\'' +
//            ", bookPrice=" + bookPrice +
//            ", bookAuthor='" + bookAuthor + '\'' +
//            '}';
//    }

    private Integer book_id;
    private String book_name;
    private double book_price;
    private String book_author;

    public Book() {
    }

    public Book(Integer book_id, String book_name, double book_price, String book_author) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_price = book_price;
        this.book_author = book_author;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public double getBook_price() {
        return book_price;
    }

    public void setBook_price(double book_price) {
        this.book_price = book_price;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    @Override public String toString() {
        return "Book{" +
            "book_id=" + book_id +
            ", book_name='" + book_name + '\'' +
            ", book_price=" + book_price +
            ", book_author='" + book_author + '\'' +
            '}';
    }
}
