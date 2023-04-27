package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserDao {

    public static EntityManagerFactory emf= Persistence.createEntityManagerFactory("rt");

    public static BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));

    public static void adduser() throws IOException {
        EntityManager em=emf.createEntityManager();

        em.getTransaction().begin();
        User user=new User();

        System.out.println("Enter bank id");
        int id=Integer.parseInt(sc.readLine());

        Bank bank=em.find(Bank.class,id);

        System.out.println("Enter user name::");
        String name=sc.readLine();

        user.setName(name);
        user.setBank(bank);
        em.persist(user);
        em.getTransaction().commit();
        em.close();

    }

    public  static void deleteuser() throws IOException {
        EntityManager em=emf.createEntityManager();

        em.getTransaction().begin();
        System.out.println("Enter user id");
        int id=Integer.parseInt(sc.readLine());

      User user=em.find(User.class,id);
        em.remove(id);
        em.getTransaction().commit();

        em.close();



    }

}
