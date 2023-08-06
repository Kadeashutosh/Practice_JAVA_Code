package Collection.sorting;

import java.util.Arrays;

public class bubble {
    public static void main(String[]args)
{
    bubble b = new bubble();

    int num[] ={7,-5,8,4,-2,10};
    System.out.println("original Array");
    System.out.println(Arrays.toString(num)); 

    b.bubblesort(num);
    System.out.println("Sorted Arrays are "+ Arrays.toString(num));

}
    void bubblesort(int num[])
    {
        int n = num.length;
        for(int i = 0; i<n-1; i++)
          for(int j = 0; j<n-i-1;j++)
          {
            if(num[j]>num[j+1])
            {

                int temp = num[j];
                num[j] = num[j+1];
                num[j+1] =temp;


            }



          }

}
}
