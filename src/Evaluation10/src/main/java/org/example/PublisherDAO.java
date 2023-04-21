package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PublisherDAO {
    public static Configuration configuration=new Configuration().configure();
    public static SessionFactory sessionFactory=configuration.buildSessionFactory();

    public static void insertPublisher(Publisher publisher) {
        boolean flag = false;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(publisher);
//        int i = (int) session.save(publisher);
//        if (i > 0) {
//            flag = true;
//        }
        transaction.commit();
        session.close();
//        return flag;
    }

    public static void deletePublisher(Publisher publisher) throws IOException {

            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the id of publisher");
            int publisherid = Integer.parseInt(sc.readLine());

//
            Publisher publisher1 = session.get(Publisher.class, publisherid);
            session.delete(publisher1);
            transaction.commit();
            session.close();
        }
    }







