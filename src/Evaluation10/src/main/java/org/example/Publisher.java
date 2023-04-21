package org.example;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="newpublisher2")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int publisherid;
    private String publishername;
    private String publicationdate;

    @OneToOne
    private Book book;


    public Publisher()
    {
        super();
    }

    public Publisher(int publisherid, String publishername, String publicationdate, Book book) {
        this.publisherid = publisherid;
        this.publishername = publishername;
        this.publicationdate = publicationdate;
        this.book = book;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherid=" + publisherid +
                ", publishername='" + publishername + '\'' +
                ", publicationdate=" + publicationdate +
                ", book=" + book +
                '}';
    }

    public int getPublisherid() {
        return publisherid;
    }

    public void setPublisherid(int publisherid) {
        this.publisherid = publisherid;
    }

    public String getPublishername() {
        return publishername;
    }

    public void setPublishername(String publishername) {
        this.publishername = publishername;
    }

    public String getPublicationdate() {
        return publicationdate;
    }

    public void setPublicationdate(String publicationdate) {
        this.publicationdate = publicationdate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
