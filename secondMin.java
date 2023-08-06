import java.util.Arrays;

public class secondMin {
    
    public static void main(String[]args)
    {
     int [] my_array = {1,3,5,8,6,12,11,13};
    
    System.out.println("Our original array is "+Arrays.toString(my_array));
   
    int min = Integer.MAX_VALUE;
    int second_min = Integer.MAX_VALUE;

    for(int i =0; i< my_array.length;i++)
    {
        if(my_array[i]==min)
        {
            second_min= min;
        }
        else if(my_array[i]<min)
        {
          second_min = min;
          min = my_array[i];
        }
        else if(my_array[i]>second_min)
        {
            second_min = my_array[i];
        }
    }
    System.out.println("Our 2nd min element is "+ second_min);
    }
}
