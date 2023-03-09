package Evaluation5;
import java.util.*;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class CallCentre {
static int balance=0;
    public void prepaidUser()
    {

        System.out.println("Choose option 0 or 1:");
        Scanner sc=new Scanner(System.in);
        int ch1=sc.nextInt();
        switch(ch1)
        {
            case 0:
                System.out.println("check balance");
                System.out.println("Balance of the user is:"+balance);
               // System.out.println("Validity of the user is::"+);

                break;
            case 1:
                System.out.println("Do the recharge");
                System.out.println("Enter the recharge amount");
               int amount=sc.nextInt();
               if(amount<0)
               {
                   try {
                       throw new RechargeAmountTooLow();
                   } catch (RechargeAmountTooLow e) {
                       e.getMessage();
                   }
               }
               balance+=amount;
                System.out.println("New balanace is::"+balance);
                System.out.println("Hurray!!Your validity has been extended by one month");
              //  System.out.println(LocalDate.plusMonths(1));

                break;
        }
    }


    public void newConnection()
    {
 List<Integer>users=new ArrayList<>();
        //String name,email,address,simtype;
 //int aadharnumber,balance;
 //Random number=new Random(10);
        System.out.println("Enter name of user");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String names[];
        System.out.println("Enter email id");
        String email=sc.nextLine();
        String email[];
        System.out.println("Enter address");
        String address=sc.nextLine();
        String address[];
        System.out.println("Enter simtype");
        String simtype=sc.nextLine();
        System.out.println("Enter aadharNumber::");
        int adharno=sc.nextInt();
        System.out.println("Enter balanace:");
         balance= sc.nextInt();
        System.out.println("=========Registration Succesful==========");
        System.out.println("Your new validity begins from::"+ LocalDate.now());


        //int min=0,max=9;
           // int number=(int)Math.floor(Math.random()*(max-min+1)+min);
        Random random = new Random();
        long mobilenum = random.nextLong() % 10000000000L;
        System.out.println("Mobile number is::"+mobilenum);
        int [] mobileno=new int[10];
        for(int i=0;i<10;i++)
        {
            mobileno[i]= (int) mobilenum;
        }

        boolean mob=true;
        if(mob=false)
        {
            try {
                throw new UserDoesNotExistException();
            } catch (UserDoesNotExistException e) {
                e.getMessage();
            }
        }
    }
    public void displayUsers()
    {

    }
}
