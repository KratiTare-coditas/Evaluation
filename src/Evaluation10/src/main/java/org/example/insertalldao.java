package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class insertalldao {


    public void insertAll() throws IOException, IOException {



        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Book book=new Book();
        System.out.println("Enter Author Id in which you when add book ");
        int authorId= Integer.parseInt(br.readLine());
        Author user = session.get(Author.class,authorId);

        List<Book> productList = new ArrayList<>();
        System.out.println("Enter Number Books to add ");
        int count= Integer.parseInt(br.readLine());
        for (int i=0;i<count;i++) {

            System.out.println("Enter  Book Id ");
            System.out.println("Enter  Publisher Id ");
            int bid = Integer.parseInt(br.readLine());
            int pid = Integer.parseInt(br.readLine());

            Book book1 = session.get(Book.class,bid);
            Publisher publisher = session.get(Publisher.class,pid);

            book1.setAuthor(user);
            book1.setPublisher(publisher);

            productList.add(book1);
            session.save(book1);

        }
        System.out.println("Add in list");
        user.setBooks(productList);
        session.save(user);

        transaction.commit();
        session.close();

    }

}
