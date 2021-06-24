package JavaArrayList;

import java.util.ArrayList;

public class FruitsGetandSetArrayList {

	public static void main(String[] args) {
		// FruitsGetandSetArrayList
		
		ArrayList<String> al=new ArrayList<String>();  
		  al.add("Mango");  
		  al.add("Apple");  
		  al.add("Banana");  
		  al.add("Grapes");  
		  //accessing the element    
		  System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
		  //changing the element  
		  al.set(1,"Dates");  
		  //Traversing list  
		  for(String fruit:al)    
		    System.out.println(fruit);    	
		

	}

}
