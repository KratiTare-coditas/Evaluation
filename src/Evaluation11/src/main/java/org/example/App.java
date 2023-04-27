package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, ParseException {
        boolean flag=true;
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
       while(flag)
       {
           System.out.println("1.Insert Bank");
           System.out.println("2.Insert Accounts");
           System.out.println("3.Insert User");

           System.out.println("4 for Query 2");
           System.out.println("5 for Query 1");
           System.out.println("6 for Query 3");

           System.out.println("Enter ur choice::");
           int ch=Integer.parseInt(sc.readLine());

           switch(ch)
           {
               case 1:
                   BankDao.addBank();
                   break;
               case 2:

                   AccountDao.addacc();
                   break;
               case 3:
                   UserDao.adduser();
                   break;
               case 4:
                   QueryN.queerynew2();
                  // QueryN.Query2();
                   break;
               case 5:
                   QueryN.query();
                   break;
               case 6:
                   QueryN.Query3();
                   break;
              
               default:
                   System.out.println("Invalid input");
                   break;
           }
       }
    }
}
