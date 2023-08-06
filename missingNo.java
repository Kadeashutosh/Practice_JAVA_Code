public class missingNo {
    public static void main(String[]args)
    {
        int tol_num;

        int [] numbers = new int[]{1,2,3,4,5,7};
        tol_num = 7;

        int expected_num_sum = tol_num * ((tol_num+1)/2);

        int num_sum = 0;
        for(int i : numbers)
        {
            num_sum = num_sum+i;

        }
        System.out.print( expected_num_sum - num_sum);

        System.out.println("\n");



    }
}
