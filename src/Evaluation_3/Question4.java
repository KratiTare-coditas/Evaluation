package Evaluation_3;

import java.util.Scanner;

class Vehicle{
    int price;
    String company;
    Vehicle(int price, String company){
        this.price=price;
        this.company=company;
    }

    @Override
    public String toString() {
        return "Evaluation_3.Vehicle{" +
                "price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}
class LightMotorVehicle extends Vehicle{
    int mileage;
    LightMotorVehicle(int price, String company,int mileage) {
        super(price, company);
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Evaluation_3.LightMotorVehicle{" +
                "mileage=" + mileage +
                ", price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}
class HeavyMotorVehicle extends Vehicle{
    int capacityInTon;
    HeavyMotorVehicle(int price, String company,int capacityInTon) {
        super(price, company);
        this.capacityInTon = capacityInTon;
    }

    @Override
    public String toString() {
        return "Evaluation_3.HeavyMotorVehicle{" +
                "capacityInTon=" + capacityInTon +
                ", price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}
public class Question4 {
    public static void main(String args[]){
        Vehicle vehicle[]=new Vehicle[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Enter 1 for lightmototvehicle 2 for heavy");
            int choice = sc.nextInt();
            if(choice==1){
                vehicle[i] = new LightMotorVehicle(250000,"FORD",35);
            }
            else if(choice==2){
                vehicle[i] = new HeavyMotorVehicle(700000,"TATA",50);
            }

        }
        for(int i=0;i<10;i++){
            System.out.println(vehicle[i]);
        }
    }
}