package org.example;

import javax.persistence.*;

@Entity
@Table(name="newbook2")
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int bookid;
    private String bookname;
    private int price=500;

    @ManyToOne
    private Author author;


    @OneToOne(mappedBy ="book")
    private Publisher publisher;
    public Book()
    {
        super();
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book(int bookid, String bookname, int price, Author author, Publisher publisher) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
    }
}
