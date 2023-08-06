package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[]args)
    {
    LinkedList<String> l_list = new LinkedList<String>();

    l_list.add("zshu");
    l_list.add("Yharta");
    l_list.add("Dhruv");
    l_list.add("Aaydip");
    l_list.add("pritam");
    l_list.add("sagar");
    
    System.out.println("original list is "+l_list);

    Iterator itr = l_list.descendingIterator();

    System.out.println("The Items in Reverse Order that");

    while(itr.hasNext())
    {

    System.out.print(itr.next()+" ");
    }


    }
}
