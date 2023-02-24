package Evaluation4;

public class Question2b {
    public static void main(String[] args) {
        String s = "hey krati here";
        int count = 0;
        char[] array1 = s.toCharArray();

        String[] array2 = new String[s.length()];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {

                if ((array1[i] == 'a' || array1[i] == 'e' || array1[i] == 'i' || array1[i] == 'o' || array1[i] == 'u')) {


                    count++;
                    array2[j] = String.valueOf(array1[i]);
                }
            }

        }
        for(int j=0;j<array2.length;j++)
        {
            System.out.println(array2[j]);
        }
    }

}
