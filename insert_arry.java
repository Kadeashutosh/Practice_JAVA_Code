import java.util.Arrays;

public class insert_arry {
    
    public static void main(String[]args)
    {
     int []my_array = {11,22,33,44,55,66,77,88,99};

     System.out.println("Our original array is "+Arrays.toString(my_array));

     int indexposition = 3;
     int newvalue = 65;

     for(int i=my_array.length-1; i > indexposition ; i--)
     {
        my_array[i]= my_array[i-1];
     }
     my_array[indexposition]=newvalue;
     System.out.println("Our inserted Array is "+Arrays.toString(my_array));

    }
}
