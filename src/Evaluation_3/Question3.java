interface Test{
    void Square();
}
class ArithmeticClass implements Test{


    @Override
    public void Square() {
        System.out.println("This is Square");
    }
}



public class Question3 {
    public static void main(String[] args){
        ArithmeticClass a = new ArithmeticClass();
        a.Square();
    }
}