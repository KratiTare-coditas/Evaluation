package org.example;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import javax.persistence.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, ParseException {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();

        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
        Book book=new Book();
        boolean flag = true;
        while(flag){
            System.out.println("Press 0 for exit ");
            System.out.println("Press 1 for Inserting data");
            System.out.println("Press 2 for update");
            System.out.println("Press 3 for Delete Author");
            System.out.println("Press 4 for delete Publisher");
            System.out.println("Press 5 for delete book");
            System.out.println("Press 6 for query 1");
            System.out.println("Press 7");
            System.out.println("Press 8 for query 2");
            System.out.println("Press 9 for query 3");
            System.out.println("Enter ur choice:");
            int ch = Integer.parseInt(sc.readLine());
            switch(ch){

                case 0:
                    flag = false;
                    break;
                case 1 :
                    Session session = sessionFactory.openSession();
                    Transaction transaction = session.beginTransaction();
                    System.out.println("Enter the name of author");
                    String name = sc.readLine();
                    Author author = new Author();
                    List<Book> books = new ArrayList<>();
                    Publisher publication = new Publisher();
                   author.setAuthorname(name);
                    boolean flags = true;
                    while (flags) {
                     System.out.println("Press 0 To exit or enter the Title of Books");
                     String choice = sc.readLine();



                    if (choice.equals("0")) {
                         flags = false;
                                break;
                      } else {
                       Book b1 = new Book();
                        b1.setBookname(choice);
                     System.out.println("Enter the price ");
                     int price = Integer.parseInt(sc.readLine());
                      b1.setPrice(price);

                     System.out.println("Enter publication date");
                      String date=sc.readLine();

                      System.out.println("enter the publication name");
                      String pubName = sc.readLine();
                    publication.setPublishername(pubName);
                    publication.setPublicationdate(date);
                    publication.setBook(b1);
                   b1.setPublisher(publication);
                    b1.setAuthor(author);



        session.save(b1);
        session.save(publication);
        books.add(b1);
    }
    author.setBooks(books);
    session.save(author);
}

transaction.commit();
session.close();
                    break;

                case 2:
                    System.out.println("Enter bookname that you wanna update");
                    String bookname1=sc.readLine();
                    System.out.println("Enter price to be updated");
                    int p1=Integer.parseInt(sc.readLine());
                   BookDAO.Updatebook(bookname1,p1);
                    System.out.println("Updation done!");


                 break;


                case 3:
                    Author author2=new Author();
                    AuthorDAO.deleteauthor(author2);
                    break;

                case 4:
                    Publisher publisher1=new Publisher();
                    PublisherDAO.deletePublisher(publisher1);

                    break;
                case 5:
                    //BookDAO.deleteBook(book);
                    break;

                case 6:
                    Session session4 = sessionFactory.openSession();
                    Transaction transaction4 = session4.beginTransaction();
                    List<Publisher> publishers = session4.createQuery("from Publisher where publicationdate <='2021-01-01'").list();


                    //criteria.add(Restrictions.eq("publishername", "Nirali Publication"));





                    transaction4.commit();


                   for(Publisher result1:publishers)
                   {
                       System.out.println(result1);
                   }
                   session4.close();
                break;

//                case 7:
//
//                    Session session3 = sessionFactory.openSession();
//                    Transaction transaction3 = session3.beginTransaction();
//
//                    Criteria criteria1 = session3.createCriteria(Publisher.class);
//
//
//                    criteria1.add(Restrictions.eq("publishername", "Nirali Publication"));
//
//
//                   // criteria1.add(Restrictions.gt("price", 500));
//
//                      transaction3.commit();
//                    List<Publisher> result2 = criteria1.list();
//                    for(Publisher result1:result2)
//                    {
//                        System.out.println(result2);
//                    }
//                    session3.close();
//                    break;
                case 8:

                    Configuration configuration1 = new Configuration().configure();
                    SessionFactory sessionFactoryn = configuration1.buildSessionFactory();
                    Session session1 = sessionFactoryn.openSession();
                    Transaction transaction1 = session1.beginTransaction();

                    List<Publisher> booksn = session1.createQuery("FROM Publisher b WHERE b.publishername = 'Nirali Publication'").list();

                    transaction1.commit();


                    for(Publisher booknew : booksn) {
                        System.out.println(booknew.getPublishername());
                    }
                    session1.close();
                    break;

                case 9:
                    Session session2 = sessionFactory.openSession();
                    Transaction tx = session2.beginTransaction();
                    try {
                        List<Author> authors = session2.createQuery("from Author where authorname like 'a%i'").list();
                        for (Author author1 : authors) {
                            System.out.println(author1.getAuthorname());
                        }
                        tx.commit();
                    } catch (Exception e) {
                        if (tx != null) {
                            tx.rollback();
                        }
                        e.printStackTrace();
                    } finally {
                        session2.close();
                    }
                    break;



            }
        }
    }
}