package Evaluation2;

public class Question3 {
    public static void main(String[] args) {
        int array[]={2,3,4,5,6,7,8};
        int sum=0,mul=1;
        for(int i=0;i<array.length;i++)
        {
            if((array[i]%2)==0)
            {
                sum=sum+array[i];
            }
            else
            {
                if((array[i]!=0))
                {
                    mul=mul*array[i];
                }
            }
        }
        System.out.println("Sum of elements at even position is::"+sum);
        System.out.println("Multiplication of elements at odd position is"+mul);
    }
}
