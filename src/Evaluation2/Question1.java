package Evaluation2;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        int id;
        int marks = 90;
        String lastName, education;
        Scanner sc;
      //  int marks=sc.nextInt();
        //Scanner sc= new Scanner(System.in);
        //Scanner sc= sc.nextInt();
//int marks=sc.nextInt();
      //  String str= sc.nextLine()
        if(marks>=70)
        {
            System.out.println("Distinction");
        }
        else if(marks<70 && marks>=60)
        {
            System.out.println("First class");
        }
        else if(marks<60 && marks>=55)
        {
            System.out.println("Higher Second class");
        }
        else if(marks<55 && marks>=50)
        {
            System.out.println("Second class");
        }
        else if(marks<50 && marks>=35)
        {
            System.out.println("Pass class");
        }
        else if(marks<35)
        {
            System.out.println("Fail");
        }
        else {
            System.out.println("Invalid input");
        }

    }
}
