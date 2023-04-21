package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AuthorDAO {
    public static Configuration configuration = new Configuration().configure();
    public static SessionFactory sessionFactory = configuration.buildSessionFactory();

    public static boolean insertAuthor(Author author) {
        boolean flag = false;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(author);
        int i = (int) session.save(author);
        if (i > 0) {
            flag = true;
        }
        transaction.commit();
        session.close();
        return flag;
    }

    public static void deleteauthor(Author author) throws IOException {


            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the id of author which you want to delete");
            int authorid = Integer.parseInt(sc.readLine());

           Author author1 = session.get(Author.class, authorid);
            session.delete(author1);
            transaction.commit();
            session.close();
        }

}




