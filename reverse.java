public class reverse {
    public static void main(String[]args)
    {
        reverse main = new reverse();

        String strGiven = "This is the testing String";

        System.out.println("The given String is "+strGiven);
        System.out.print("The String reveresed is :-");
        main.reverseEachWord(strGiven);
    }
public void reverseEachWord(String str1)
{
  String [] each_word = str1.split(" ");
  String rev_string = "";
  
  for(int i=0 ; i <each_word.length; i++)
  {
    String word = each_word[i];
    String rev_word = "";

  for(int j = word.length()-1; j>=0 ; j--)
  {
    rev_word = rev_word+ word.charAt(j);
  }
  rev_string = rev_string+ rev_word + " ";

  }
System.out.println(rev_string);

}

}
