import java.util.*; 
class Treemap{ 
public static void main(String args[]){ 
 TreeMap<Integer,String> hm=new TreeMap<Integer,String>(); 
 hm.put(103,"Technolamror"); 
 hm.put(100,"Amit"); 
 hm.put(102,"Ravi"); 
 hm.put(101,"Vijay"); 
 hm.put(103,"Technolamror"); 
 
 for(Map.Entry m:hm.entrySet()){ 
 System.out.println(m.getKey()+" "+m.getValue()); 
 } 
} 
}