package org.example;

import javax.persistence.*;
import javax.persistence.criteria.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class QueryN {

    public static EntityManagerFactory emf= Persistence.createEntityManagerFactory("rt");

    public static BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));

public static  void Query1()
{
    EntityManager entityManager=emf.createEntityManager();
    entityManager.getTransaction().begin();


    String jpql = "SELECT a FROM Account a WHERE a.opendate < :cutoffDate";
    Query query = entityManager.createQuery(jpql);
    query.setParameter("cutoffDate", java.sql.Date.valueOf("2023-01-01"));

    List<Account> users = query.getResultList();
    for (Account user : users) {
        System.out.println("ID:"+user.getAccountid());
        System.out.println("TYPE:"+user.getAcctype());
        System.out.println("DATE:"+user.getOpendate());
        System.out.println("----------------------------");
    }
    entityManager.getTransaction().commit();
    entityManager.close();

}

public static void queerynew2()
{

    EntityManager entityManager=emf.createEntityManager();
    entityManager.getTransaction().begin();
    CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
    CriteriaUpdate<Account> update = criteriaBuilder.createCriteriaUpdate(Account.class);
    Root<Account> accountRoot = update.from(Account.class);
    update.set(accountRoot.get("status"), "prime");
    update.where(criteriaBuilder.greaterThan(accountRoot.get("balance"), 100000));

    entityManager.createQuery(update).executeUpdate();

    entityManager.getTransaction().commit();
    entityManager.close();
}

    public static void Query2()
    {
        EntityManager entityManager=emf.createEntityManager();
        entityManager.getTransaction().begin();

        String jpql = "UPDATE Account a SET a.status = :status WHERE a.balance > :balance";
        Query query = entityManager.createQuery(jpql);
        query.setParameter("status", "prime");
        query.setParameter("balance", 100000);

        query.executeUpdate();

        entityManager.getTransaction().commit();
//
        entityManager.close();
// Execute update quer

// Commit transaction




    }
    public static void query() {
        EntityManager em1 = emf.createEntityManager() ;
        em1.getTransaction().begin();
        CriteriaBuilder cb = em1.getCriteriaBuilder();
        CriteriaQuery<User> query = cb.createQuery(User.class);
        Root<User> userRoot = query.from(User.class);
        Join<User, Account> accountJoin = userRoot.join("account");

        query.select(userRoot).distinct(true)
                .where(cb.lessThan(accountJoin.get("opendate"), new Date(2023-1900,01,01)));

        List<User> users = em1.createQuery(query).getResultList();
        System.out.println(users);
        em1.getTransaction().commit();
        em1.close();

    }

    public static void Query3() throws IOException {




        EntityManager entityManager= emf.createEntityManager();
//
//        TypedQuery<Account> query = entityManager.createQuery("SELECT a FROM Account a WHERE a.acctype = 'current' AND a.balance < 100000", Account.class);
//
//        List<Account> accounts = query.getResultList();

        System.out.println("Enter acc id");
        int id=Integer.parseInt(sc.readLine());

        Account account=entityManager.find(Account.class,id);
        System.out.println("Enter the number of months you have not maintained");
        int m=Integer.parseInt(sc.readLine());

            if (account.getBalance() < 100000 && account.getAcctype()=="current") {

                entityManager.getTransaction().begin();
                int nbalance=m*250;
               int newb= account.getBalance()-nbalance;
               account.setBalance(newb);

               entityManager.merge(account);
               entityManager.getTransaction().commit();
                System.out.println("The amount deducted will be::"+nbalance);
                System.out.println("Insufficient balance and 250/- will get cut");
            }
            else if(account.getBalance()<10000 && account.getAcctype()=="savings")
            {
                System.out.println("Save more");

                System.out.println("Enter no of months");
                int months=Integer.parseInt(sc.readLine());

                int total=months*150;
                System.out.println("You have to pay maintenance charge of Rs."+total);

            }
            else {
                System.out.println("save more");
            }
        }






    }





