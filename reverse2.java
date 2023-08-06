public class reverse2 {
    public static void main(String[] args) {
        String str1 = "Reverse words in a given string";
        System.out.println("The given string is: " + str1);
        System.out.println("The new string after reversed the words: " + WordsInReverse(str1));
       }
       public static String WordsInReverse(String str1) {
        StringBuilder sb = new StringBuilder(str1);
        String StrRev = sb.reverse().toString();
}
}