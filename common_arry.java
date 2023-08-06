import java.util.Arrays;
import java.util.HashSet;

public class common_arry {
    public static void main(String[]args)
    {
        String[] array1 = {"java","python","php","c++","node.js","dsa"};
        String[] array2 = {"Maths","Chemistry","English","c++","node.js","Bio"};

        System.out.println("String1 is"+ Arrays.toString(array1));
        System.out.println("String2 is"+ Arrays.toString(array2));

        HashSet<String> set = new HashSet<String>();
        for (int i =0; i< array1.length;i++)
        {
          for(int j=0; j< array2.length;j++)
          {
            if(array1[i].equals(array2[j]))
            {
                set.add(array1[i]);
            }
            
          }


        }

        System.out.println("Our Set is "+(set));
    }
}
