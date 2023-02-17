package Evaluation_3;

class CalculateAreaAndPeri{
   private int length;
    private int breadth;
    int area=0,perimeter=0;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getArea() {
        return length*breadth;
    }


    public int getPerimeter() {
        return 2*(length+breadth);
    }

    @Override
    public String toString() {
        return "Evaluation_3.CalculateAreaAndPeri{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
}

public class Question1 {
    public static void main(String[] args) {
        CalculateAreaAndPeri c=new CalculateAreaAndPeri();
        c.setLength(10);
        c.setBreadth(2);
        System.out.println("The area of rectangle is::"+c.getArea());
        System.out.println("The perimeter of rectangle is::"+c.getPerimeter());
    }

}
