import java.util.Arrays;

public class copy_array {
    
   public static void main(String[]args) {
    
    int[] my_arr = {10,20,30,40,50,60,70};
    System.out.println("our original array is"+Arrays.toString(my_arr));

    int [] array = new int[10];

    for(int i=0; i< my_arr.length;i++)
    {
        array[i] = my_arr[i];
    }
    System.out.println("our copy array is"+Arrays.toString(my_arr));
   } 
}
