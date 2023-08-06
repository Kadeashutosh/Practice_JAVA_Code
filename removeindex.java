import java.util.Arrays;

public class removeindex {
    
 public static void main(String[]args)
 {
int [] my_arr = {11,22,33,44,55,66,77,88,99};
 
System.out.println("The original array is "+ Arrays.toString(my_arr));

int removeindex = 1;

for(int i = removeindex ; i< my_arr.length-1; i++)
{
      my_arr[i]=my_arr[i+1];
      
}
System.out.println("After removal the array is "+ Arrays.toString(my_arr));
 }   
}


