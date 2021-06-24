package JavaArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class BookRetainAllmethodArrayList {
	
	public static void main(String[] args) {
		// ArrayList example of retainAll() method
		
		ArrayList<String> al=new ArrayList<String>();  
		  al.add("Let us C");  
		  al.add("Data Communications");  
		  al.add("Operating System");  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Let us C");  
		  al2.add("Data Networking");  
		  al.retainAll(al2);  
		  System.out.println("iterating the elements after retaining the elements of al2");  
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		   
		  }  
		 }  
		}  
	
	

	
	
	
	
