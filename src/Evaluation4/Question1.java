package Evaluation4;
//wap to calculate total number of characters
//count no of tokens
//count no of vowels and make new string out of it
//if(!vowels then add next letter,& form string out of it
import java.util.Scanner;
import java.util.StringTokenizer;

public class Question1 {
    public static void main(String[] args) {

        String s = "Hey I am Krati";
        int count = 0;
        StringTokenizer stringTokenizer = new StringTokenizer("Hey I am Krati");

        System.out.println("The number of tokens is::" + stringTokenizer.countTokens());
        System.out.println("********************************************");

        //char[] array1=s.split("");
        char[] array1 = s.toCharArray();

        String[] array2 = new String[s.length()];

        for (int i = 0; i < array1.length; i++) {
            if ((array1[i] == 'a' || array1[i] == 'e' || array1[i] == 'i' || array1[i] == 'o' || array1[i] == 'u')) {


                count++;
                //array2[j] = array1[i];
            }

        }
        System.out.println("number of vowels is::" + count);

    }

}
//Output:
