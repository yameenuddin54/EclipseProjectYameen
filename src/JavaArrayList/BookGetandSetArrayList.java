package JavaArrayList;

import java.util.ArrayList;

public class BookGetandSetArrayList {

	public static void main(String[] args) {
		// Get and Set ArryList elements
		
		ArrayList<String> al=new ArrayList<String>();  
		  al.add("Let us C");  
		  al.add("Data Communications and Networking");  
		  al.add("Operating System");   
		  //accessing the element    
		  System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
		  //changing the element  
		  al.set(1,"Data Warehouse");  
		  //Traversing list  
		  for(String book:al)    
		    System.out.println(book);
	
	
	}
	
	
}
