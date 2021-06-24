package JavaArrayList;

import java.util.ArrayList;

public class StudentGetandSetArryList {

	public static void main(String[] args) {
		// Get and Set ArryList elements
		
		ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");  
		  al.add("Gaurav");  
		  //accessing the element    
		  System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
		  //changing the element  
		  al.set(1,"Anuj");  
		  //Traversing list  
		  for(String student:al)    
		    System.out.println(student);

	}

}
