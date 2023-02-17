package Evaluation_3;

abstract  class Order{
    int memberid;
    String description;
    public abstract String accept();

    public abstract  void display();

}
class Purchaseorder extends Order{
    String customername="Rahul";

    public String accept()
    {
        return customername;
    }
    public void display()
    {
        System.out.println("show details within purchaseorder");
    }

}
class Salesorder extends Order{
    String vendorname="Rita";
    public String accept()
    {
        return vendorname;
    }
    public void display()
    {
        System.out.println("This is vendor details");
    }
}


public class Question2 {
    public static void main(String[] args) {
  Salesorder salesorder=new Salesorder();
  Purchaseorder purchaseorder=new Purchaseorder();
    }
}
