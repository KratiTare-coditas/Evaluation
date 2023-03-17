package Evaluation6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        Operations operations=new Operations();
        boolean flag=true;
        while(true)
        {
            System.out.println("O FOR EXIT");
            System.out.println("1 TO RETRIEVE");
            System.out.println("2 TO INSERT");
            System.out.println("3 TO UPDATE");
            System.out.println("4 TO DELETE");
            System.out.println(" 5 STUDENT NAME WITH Z:");
            System.out.println("6 FIND TEACHER WITH EXP 5");
            System.out.println("7 FIND STU WHERE TEACHER IS FROM PUNE");

            System.out.println("Enter your choice:");
            int ch=Integer.parseInt(sc.readLine());
            switch(ch)
            {
                case 0:
                    flag=false;
                    break;
                case 1:
                    //retrieve
                    operations.retrive();
                    break;
                case 2:
                    //
                    operations.insert();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    operations.findstu();
                    break;
                case 6:

                    break;
                case 7:
                    break;
                default:
                    System.out.println("INVALID INPUT");
                    break;
        }



        }

    }
}
