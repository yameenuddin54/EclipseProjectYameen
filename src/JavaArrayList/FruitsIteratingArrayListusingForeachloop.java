package JavaArrayList;

import java.util.ArrayList;

public class FruitsIteratingArrayListusingForeachloop {

	public static void main(String[] args) {
		// Iterating ArrayList using For-each loop
		
		ArrayList<String> fruits=new ArrayList<String>();//Creating arraylist  
		  fruits.add("Mango");//Adding object in arraylist    
		  fruits.add("Apple");    
		  fruits.add("Banana");    
		  fruits.add("Grapes");    
		  
		//Traversing list through for-each loop  
		  for(String fruit:fruits)    
		    System.out.println(fruit);    
		

	}

}
