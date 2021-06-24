package JavaHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class NumberHashSetExUsingAddandIteratorEx {

	public static void main(String[] args) {

		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
	           set.add("One");    
	           set.add("Two");    
	           set.add("Three");   
	           set.add("Four");  
	           set.add("Five");  
	           Iterator<String> i=set.iterator();  
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  
	           }  

	}

}
