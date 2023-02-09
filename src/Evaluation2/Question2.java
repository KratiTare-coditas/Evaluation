package Evaluation2;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        //String dow;
        LocalDate currentDate=LocalDate.now();
        DayOfWeek dow= currentDate.getDayOfWeek();
        String days=dow.toString().toUpperCase();
        String day[]={"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};

       // System.out.println(dow);

       switch(days){
            case "MONDAY":
                System.out.println("Its a start of week");
            break;
            case "TUESDAY":
            System.out.println("Its a second day of week");
            break;
        case "WEDNESDAY":
                System.out.println("Its a third day of week");
                  break;
        case "THURSDAY":
               System.out.println("Its a fourth day of week");
               break;
            case "FRIDAY" :
              System.out.println("Its last day of week...enjoy your weekend");
              break;
           case "SATURDAY":
                System.out.println("Its a weekend!! majjani life");
               break;
           case "SUNDAY":
              System.out.println("Last day of weekend:(");
              break;

                   }

    }
}
