package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankDao {
    public static EntityManagerFactory emf= Persistence.createEntityManagerFactory("rt");

    public static BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));

    public static  void addBank() throws IOException {
        EntityManager em=emf.createEntityManager();

        em.getTransaction().begin();
        Bank bank=new Bank();
        System.out.println("Enter bank");
        String name=sc.readLine();
        bank.setName(name);
        em.persist(bank);
        em.getTransaction().commit();
        em.close();
        System.out.println("Bank added successfully!!");

    }

    public  static void deletebank() throws IOException {
        EntityManager em=emf.createEntityManager();

        em.getTransaction().begin();
        System.out.println("Enter bank id");
        int id=Integer.parseInt(sc.readLine());

        Bank bank=em.find(Bank.class,id);
        em.remove(id);
        em.getTransaction().commit();

        em.close();



    }


}
