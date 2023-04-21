//package org.example;
//
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookDAO {
    public static Configuration configuration = new Configuration().configure();
    public static SessionFactory sessionFactory = configuration.buildSessionFactory();

    public static void insertBook(Book book) {
        boolean flag = false;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(book);
//        int i = (int) session.save(publisher);
//        if (i > 0) {
//            flag = true;
//        }
        transaction.commit();
        session.close();
//        return flag;
    }

    public static int Updatebook(String bookn, int p) throws IOException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter id");
        int id= Integer.parseInt(sc.readLine());
        Query q = session.createQuery("update Book set  bookName=:bookname1,price=:p1 where id = :id1");


        q.setParameter("bookname1", bookn);
        q.setParameter("p1", p);

        q.setParameter("id1", id);
        int i = q.executeUpdate();
        transaction.commit();

        return i;
    }
}

//OUTPUT::
//Apr 21, 2023 3:57:43 PM org.hibernate.Version logVersion
//        INFO: HHH000412: Hibernate ORM core version 5.6.5.Final
//        Apr 21, 2023 3:57:44 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
//INFO: HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
//        Apr 21, 2023 3:57:44 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
//        WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
//        Apr 21, 2023 3:57:44 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/Book?createDatabaseIfNotExist=true]
//        Apr 21, 2023 3:57:44 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001001: Connection properties: {password=****, user=root}
//        Apr 21, 2023 3:57:44 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001003: Autocommit mode: false
//        Apr 21, 2023 3:57:44 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
//INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
//        Apr 21, 2023 3:57:45 PM org.hibernate.dialect.Dialect <init>
//INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL5Dialect
//        Apr 21, 2023 3:57:46 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
//        INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@1a47a1e8] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
//        Hibernate: alter table newbook2 add constraint FKom24kiu4qstprkpy9qkidelbx foreign key (author_authorid) references newauthor2 (authorid)
//        Hibernate: alter table newpublisher2 add constraint FKp8q8jjl5oxl544ootyahjlof0 foreign key (book_bookid) references newbook2 (bookid)
//        Press 0 for exit
//        Press 1 for Inserting data
//        Press 2 for update
//        Press 3 for Delete Author
//        Press 4 for delete Publisher
//        Press 5 for delete book
//        Press 6 for query 1
//        Press 7
//        Press 8 for query 2
//        Press 9 for query 3
//        Enter ur choice:
//        1
//        Enter the name of author
//        Paulo Cohelo
//        Press 0 To exit or enter the Title of Books
//        The alchemist
//        Enter the price
//        900
//        Enter publication date
//        2020-01-09
//        enter the publication name
//        Nirali Publication
//        Hibernate: insert into newbook2 (author_authorid, bookname, price) values (?, ?, ?)
//        Hibernate: insert into newpublisher2 (book_bookid, publicationdate, publishername) values (?, ?, ?)
//        Hibernate: insert into newauthor2 (authorname) values (?)
//        Press 0 To exit or enter the Title of Books
//        0
//        Hibernate: update newbook2 set author_authorid=?, bookname=?, price=? where bookid=?
//        Press 0 for exit
//        Press 1 for Inserting data
//        Press 2 for update
//        Press 3 for Delete Author
//        Press 4 for delete Publisher
//        Press 5 for delete book
//        Press 6 for query 1
//        Press 7
//        Press 8 for query 2
//        Press 9 for query 3
//        Enter ur choice:
//        2
//        Enter bookname that you wanna update
//        The alchemist
//        Enter price to be updated
//        500
//        Apr 21, 2023 3:58:50 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
//        WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
//        Apr 21, 2023 3:58:50 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/Book?createDatabaseIfNotExist=true]
//        Apr 21, 2023 3:58:50 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001001: Connection properties: {password=****, user=root}
//        Apr 21, 2023 3:58:50 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001003: Autocommit mode: false
//        Apr 21, 2023 3:58:50 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
//INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
//        Apr 21, 2023 3:58:50 PM org.hibernate.dialect.Dialect <init>
//INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL5Dialect
//        Apr 21, 2023 3:58:50 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
//        INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@1536ea40] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
//        Hibernate: alter table newbook2 add constraint FKom24kiu4qstprkpy9qkidelbx foreign key (author_authorid) references newauthor2 (authorid)
//        Hibernate: alter table newpublisher2 add constraint FKp8q8jjl5oxl544ootyahjlof0 foreign key (book_bookid) references newbook2 (bookid)
//        Enter id
//        5
//        Hibernate: update newbook2 set bookName=?, price=? where bookid=?
//        Updation done!
//        Press 0 for exit
//        Press 1 for Inserting data
//        Press 2 for update
//        Press 3 for Delete Author
//        Press 4 for delete Publisher
//        Press 5 for delete book
//        Press 6 for query 1
//        Press 7
//        Press 8 for query 2
//        Press 9 for query 3
//        Enter ur choice:
//        6
//        Hibernate: select publisher0_.publisherid as publishe1_2_, publisher0_.book_bookid as book_boo4_2_, publisher0_.publicationdate as publicat2_2_, publisher0_.publishername as publishe3_2_ from newpublisher2 publisher0_ where publisher0_.publicationdate<='2021-01-01'
//        Hibernate: select book0_.bookid as bookid1_1_0_, book0_.author_authorid as author_a4_1_0_, book0_.bookname as bookname2_1_0_, book0_.price as price3_1_0_, author1_.authorid as authorid1_0_1_, author1_.authorname as authorna2_0_1_, publisher2_.publisherid as publishe1_2_2_, publisher2_.book_bookid as book_boo4_2_2_, publisher2_.publicationdate as publicat2_2_2_, publisher2_.publishername as publishe3_2_2_ from newbook2 book0_ left outer join newauthor2 author1_ on book0_.author_authorid=author1_.authorid left outer join newpublisher2 publisher2_ on book0_.bookid=publisher2_.book_bookid where book0_.bookid=?
//        Hibernate: select publisher0_.publisherid as publishe1_2_2_, publisher0_.book_bookid as book_boo4_2_2_, publisher0_.publicationdate as publicat2_2_2_, publisher0_.publishername as publishe3_2_2_, book1_.bookid as bookid1_1_0_, book1_.author_authorid as author_a4_1_0_, book1_.bookname as bookname2_1_0_, book1_.price as price3_1_0_, author2_.authorid as authorid1_0_1_, author2_.authorname as authorna2_0_1_ from newpublisher2 publisher0_ left outer join newbook2 book1_ on publisher0_.book_bookid=book1_.bookid left outer join newauthor2 author2_ on book1_.author_authorid=author2_.authorid where publisher0_.book_bookid=?
//        Hibernate: select book0_.bookid as bookid1_1_0_, book0_.author_authorid as author_a4_1_0_, book0_.bookname as bookname2_1_0_, book0_.price as price3_1_0_, author1_.authorid as authorid1_0_1_, author1_.authorname as authorna2_0_1_, publisher2_.publisherid as publishe1_2_2_, publisher2_.book_bookid as book_boo4_2_2_, publisher2_.publicationdate as publicat2_2_2_, publisher2_.publishername as publishe3_2_2_ from newbook2 book0_ left outer join newauthor2 author1_ on book0_.author_authorid=author1_.authorid left outer join newpublisher2 publisher2_ on book0_.bookid=publisher2_.book_bookid where book0_.bookid=?
//        Hibernate: select publisher0_.publisherid as publishe1_2_2_, publisher0_.book_bookid as book_boo4_2_2_, publisher0_.publicationdate as publicat2_2_2_, publisher0_.publishername as publishe3_2_2_, book1_.bookid as bookid1_1_0_, book1_.author_authorid as author_a4_1_0_, book1_.bookname as bookname2_1_0_, book1_.price as price3_1_0_, author2_.authorid as authorid1_0_1_, author2_.authorname as authorna2_0_1_ from newpublisher2 publisher0_ left outer join newbook2 book1_ on publisher0_.book_bookid=book1_.bookid left outer join newauthor2 author2_ on book1_.author_authorid=author2_.authorid where publisher0_.book_bookid=?
//        Hibernate: select book0_.bookid as bookid1_1_0_, book0_.author_authorid as author_a4_1_0_, book0_.bookname as bookname2_1_0_, book0_.price as price3_1_0_, author1_.authorid as authorid1_0_1_, author1_.authorname as authorna2_0_1_, publisher2_.publisherid as publishe1_2_2_, publisher2_.book_bookid as book_boo4_2_2_, publisher2_.publicationdate as publicat2_2_2_, publisher2_.publishername as publishe3_2_2_ from newbook2 book0_ left outer join newauthor2 author1_ on book0_.author_authorid=author1_.authorid left outer join newpublisher2 publisher2_ on book0_.bookid=publisher2_.book_bookid where book0_.bookid=?
//        Hibernate: select publisher0_.publisherid as publishe1_2_2_, publisher0_.book_bookid as book_boo4_2_2_, publisher0_.publicationdate as publicat2_2_2_, publisher0_.publishername as publishe3_2_2_, book1_.bookid as bookid1_1_0_, book1_.author_authorid as author_a4_1_0_, book1_.bookname as bookname2_1_0_, book1_.price as price3_1_0_, author2_.authorid as authorid1_0_1_, author2_.authorname as authorna2_0_1_ from newpublisher2 publisher0_ left outer join newbook2 book1_ on publisher0_.book_bookid=book1_.bookid left outer join newauthor2 author2_ on book1_.author_authorid=author2_.authorid where publisher0_.book_bookid=?
//        Publisher{publisherid=1, publishername='Nirali Publication', publicationdate=2018-09-08, book=org.example.Book@420a8042}
//        Publisher{publisherid=3, publishername='Yash publication', publicationdate=2020-12-31, book=org.example.Book@61191222}
//        Publisher{publisherid=4, publishername='Nirali Publication', publicationdate=2020-01-09, book=org.example.Book@401c4250}
//        Press 0 for exit
//        Press 1 for Inserting data
//        Press 2 for update
//        Press 3 for Delete Author
//        Press 4 for delete Publisher
//        Press 5 for delete book
//        Press 6 for query 1
//        Press 7
//        Press 8 for query 2
//        Press 9 for query 3
//        Enter ur choice:
//        8
//        Apr 21, 2023 3:59:27 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
//        WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
//        Apr 21, 2023 3:59:27 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/Book?createDatabaseIfNotExist=true]
//        Apr 21, 2023 3:59:27 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001001: Connection properties: {password=****, user=root}
//        Apr 21, 2023 3:59:27 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//        INFO: HHH10001003: Autocommit mode: false
//        Apr 21, 2023 3:59:27 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
//INFO: HHH000115: Hibernate connection pool size: 20 (min=1)
//        Apr 21, 2023 3:59:27 PM org.hibernate.dialect.Dialect <init>
//INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL5Dialect
//        Apr 21, 2023 3:59:27 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
//        INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@5f9f3e58] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
//        Hibernate: alter table newbook2 add constraint FKom24kiu4qstprkpy9qkidelbx foreign key (author_authorid) references newauthor2 (authorid)
//        Hibernate: alter table newpublisher2 add constraint FKp8q8jjl5oxl544ootyahjlof0 foreign key (book_bookid) references newbook2 (bookid)
//        Hibernate: select publisher0_.publisherid as publishe1_2_, publisher0_.book_bookid as book_boo4_2_, publisher0_.publicationdate as publicat2_2_, publisher0_.publishername as publishe3_2_ from newpublisher2 publisher0_ where publisher0_.publishername='Nirali Publication'
//        Hibernate: select book0_.bookid as bookid1_1_0_, book0_.author_authorid as author_a4_1_0_, book0_.bookname as bookname2_1_0_, book0_.price as price3_1_0_, author1_.authorid as authorid1_0_1_, author1_.authorname as authorna2_0_1_, publisher2_.publisherid as publishe1_2_2_, publisher2_.book_bookid as book_boo4_2_2_, publisher2_.publicationdate as publicat2_2_2_, publisher2_.publishername as publishe3_2_2_ from newbook2 book0_ left outer join newauthor2 author1_ on book0_.author_authorid=author1_.authorid left outer join newpublisher2 publisher2_ on book0_.bookid=publisher2_.book_bookid where book0_.bookid=?
//        Hibernate: select publisher0_.publisherid as publishe1_2_2_, publisher0_.book_bookid as book_boo4_2_2_, publisher0_.publicationdate as publicat2_2_2_, publisher0_.publishername as publishe3_2_2_, book1_.bookid as bookid1_1_0_, book1_.author_authorid as author_a4_1_0_, book1_.bookname as bookname2_1_0_, book1_.price as price3_1_0_, author2_.authorid as authorid1_0_1_, author2_.authorname as authorna2_0_1_ from newpublisher2 publisher0_ left outer join newbook2 book1_ on publisher0_.book_bookid=book1_.bookid left outer join newauthor2 author2_ on book1_.author_authorid=author2_.authorid where publisher0_.book_bookid=?
//        Hibernate: select book0_.bookid as bookid1_1_0_, book0_.author_authorid as author_a4_1_0_, book0_.bookname as bookname2_1_0_, book0_.price as price3_1_0_, author1_.authorid as authorid1_0_1_, author1_.authorname as authorna2_0_1_, publisher2_.publisherid as publishe1_2_2_, publisher2_.book_bookid as book_boo4_2_2_, publisher2_.publicationdate as publicat2_2_2_, publisher2_.publishername as publishe3_2_2_ from newbook2 book0_ left outer join newauthor2 author1_ on book0_.author_authorid=author1_.authorid left outer join newpublisher2 publisher2_ on book0_.bookid=publisher2_.book_bookid where book0_.bookid=?
//        Hibernate: select publisher0_.publisherid as publishe1_2_2_, publisher0_.book_bookid as book_boo4_2_2_, publisher0_.publicationdate as publicat2_2_2_, publisher0_.publishername as publishe3_2_2_, book1_.bookid as bookid1_1_0_, book1_.author_authorid as author_a4_1_0_, book1_.bookname as bookname2_1_0_, book1_.price as price3_1_0_, author2_.authorid as authorid1_0_1_, author2_.authorname as authorna2_0_1_ from newpublisher2 publisher0_ left outer join newbook2 book1_ on publisher0_.book_bookid=book1_.bookid left outer join newauthor2 author2_ on book1_.author_authorid=author2_.authorid where publisher0_.book_bookid=?
//        Nirali Publication
//        Nirali Publication
//        Press 0 for exit
//        Press 1 for Inserting data
//        Press 2 for update
//        Press 3 for Delete Author
//        Press 4 for delete Publisher
//        Press 5 for delete book
//        Press 6 for query 1
//        Press 7
//        Press 8 for query 2
//        Press 9 for query 3
//        Enter ur choice:
//        9
//        Hibernate: select author0_.authorid as authorid1_0_, author0_.authorname as authorna2_0_ from newauthor2 author0_ where author0_.authorname like 'a%i'
//        Aarti
//        Press 0 for exit
//        Press 1 for Inserting data
//        Press 2 for update
//        Press 3 for Delete Author
//        Press 4 for delete Publisher
//        Press 5 for delete book
//        Press 6 for query 1
//        Press 7
//        Press 8 for query 2
//        Press 9 for query 3
//        Enter ur choice:
//

