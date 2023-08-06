package String;

public class concat {
    public static void main(String[]args)
    {
        String str1 = "Java is very Good Programming language";
        String str2 = " And Python is the best Programming language";

        System.out.println("1st String is " + str1);
        System.out.println(" 2st String is " + str2);

        String str3 = str1.concat(str2);

        System.out.println(str3);



    }
}
