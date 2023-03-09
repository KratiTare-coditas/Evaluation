package Evaluation5;

import java.util.Scanner;
import java.util.*;
public class SIMmain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CallCentre callcentre=new CallCentre();
       boolean flag=true;
       while(flag)
       {
           System.out.println("Choose option 0 for exit");
           System.out.println("Choose option 1 for prepaid user");
           System.out.println("Choose option 2 for new connection");
           System.out.println("Choose option 3 to view all users");
           System.out.println("Enter your choice");
           int ch=sc.nextInt();
           switch(ch)
           {
               case 0:
                   flag=false;
                   break;
               case 1:

                   callcentre.prepaidUser();
                   break;
               case 2:
                   int[] mobileno=new int[10];
                   System.out.println("This is for new connection");
                   callcentre.newConnection();
                   break;
               case 3:
                   break;
           }
       }
    }
}
/*
Output:Choose option 0 for exit
Choose option 1 for prepaid user
Choose option 2 for new connection
Choose option 3 to view all users
Enter your choice
2
This is for new connection
Enter name of user
krati
Enter email id
kratitare05@gmail.com
Enter address
Indore
Enter simtype
prepaid
Enter aadharNumber::
344556
Enter balanace:
23
=========Registration Succesful==========
Your new validity begins from::2023-03-09
Mobile number is::3704131204
Choose option 0 for exit
Choose option 1 for prepaid user
Choose option 2 for new connection
Choose option 3 to view all users
Enter your choice
1
Choose option 0 or 1:
0
check balance
Balance of the user is:23
Choose option 0 for exit
Choose option 1 for prepaid user
Choose option 2 for new connection
Choose option 3 to view all users
Enter your choice
1
Choose option 0 or 1:
1
Do the recharge
Enter the recharge amount
23
New balanace is::46
Hurray!!Your validity has been extended by one month
Choose option 0 for exit
Choose option 1 for prepaid user
Choose option 2 for new connection
Choose option 3 to view all users
Enter your choice

*/
