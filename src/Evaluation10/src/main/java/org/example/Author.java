package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="newauthor2")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorid;
    private String authorname;


    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;

    public Author()
    {
        super();
    }


    public int getAuthorid() {
        return authorid;
    }

    public Author setAuthorid(int authorid) {
        this.authorid = authorid;
        return null;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Author(int authorid, String authorname, List<Book> books) {
        this.authorid = authorid;
        this.authorname = authorname;
        this.books = books;
    }


    @Override
    public String toString() {
        return "Author{" +
                "authorid=" + authorid +
                ", authorname=" + authorname +
                ", books=" + books +
                '}';
    }
}
