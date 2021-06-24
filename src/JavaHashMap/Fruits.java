package JavaHashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Fruits {

	public static void main(String[] args) {
		// 
		HashMap<Integer,String> fruits=new HashMap<Integer,String>();//Creating HashMap    
		   fruits.put(1,"Mango");  //Put elements in fruits  
		   fruits.put(2,"Apple");    
		   fruits.put(3,"Banana");   
		   fruits.put(4,"Grapes");   
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Entry<Integer, String> m : fruits.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  	

	}

}
