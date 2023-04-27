package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountDao {

    public static EntityManagerFactory emf= Persistence.createEntityManagerFactory("rt");

    public static BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));

    public static void addacc() throws IOException, ParseException {
        EntityManager em=emf.createEntityManager();

        em.getTransaction().begin();
        Account account=new Account();

        System.out.println("Enter bank id in which u want to add acc");
        int id=Integer.parseInt(sc.readLine());

        Bank bank=em.find(Bank.class,id);


        System.out.println("Enter acc type");
        String acctype=sc.readLine();

        account.setAcctype(acctype);

        if(acctype.equalsIgnoreCase("current"))
        {
            System.out.println("Enter company name");
            String company=sc.readLine();

            account.setCompany(company);
        }

        System.out.println("Enter acc balance");
        int balance=Integer.parseInt(sc.readLine());

        account.setBalance(balance);


        System.out.println("Enter open date");

        String date = sc.readLine();
        Date opDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        account.setOpendate(opDate);

        System.out.println("Enter status");
        String status=sc.readLine();
        account.setStatus(status);

        boolean flag=true;

        List<User> users=new ArrayList<User>();


//        while(flag)
//        {
            System.out.println("Enter user id or press 0 to stop");
            int ch=Integer.parseInt(sc.readLine());
//            if(ch==0)
//            {
//                flag=false;
//                break;
//
//            }
//            else
//            {
                User user=em.find(User.class,ch);
                users.add(user);

//            }
//        }

        account.setUser(users);
        em.persist(account);
        em.getTransaction().commit();




        System.out.println("");



    }

    public  static void deleteacc() throws IOException {
        EntityManager em=emf.createEntityManager();

        em.getTransaction().begin();
        System.out.println("Enter acc id");
        int id=Integer.parseInt(sc.readLine());

        Account account=em.find(Account.class,id);
        em.remove(id);
        em.getTransaction().commit();

        em.close();



    }

}
