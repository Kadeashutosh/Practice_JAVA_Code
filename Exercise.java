package Collection;
import java.util.*;
  public class Exercise {
  public static void main(String[] args) {
  // Creae a list and add some colors to the list
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Green");
  list_Strings.add("Orange");
  list_Strings.add("White");
  list_Strings.add("Black");
  // Print the list

  List<String> list_Strings2 = new ArrayList<String>();
  list_Strings2.add("ashu");
  list_Strings2.add("pritam");
  list_Strings2.add("avesh");
  list_Strings2.add("kunal");
  list_Strings2.add("sagar");
  
    // list_Strings.add(0,"violet");
    // list_Strings.add(5,"kesari");
    //for (String element : list_Strings) {
     // System.out.println(element);
     // }
      // System.out.println("The retrived element is :-");
      // String element = list_Strings.get(2);
      // System.out.println(element);

      // System.out.println("The updated element is :-");
      // list_Strings.set(2, "Ashutosh");
      // System.out.println(list_Strings);

      // if(list_Strings.contains("Black"))
      // {
      //   System.out.println("Found element ");

      // }
      // else{
      //   System.out.println("Not Found");

      // }
      // Collections.sort(list_Strings);
      // System.out.println("List After Sorting:-" +list_Strings);
      System.out.println(list_Strings);
      System.out.println(list_Strings2);

      System.out.println("Before Copy");

      Collections.copy(list_Strings, list_Strings2);
      System.out.println(list_Strings);
      System.out.println(list_Strings2);
 }
}