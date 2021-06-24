package JavaArrayList;

import java.util.ArrayList;

public class Fruits {

	public static void main(String[] args) {
		// Create an ArrayFruitsList object called Fruits with method ( Add,Set and remove methods ).
		
		ArrayList<String> fruits=new ArrayList<String>();//Creating array Fruits    
	      fruits.add("Mango");//Adding object in arraylist Fruits    
	      fruits.add("Apple");    
	      fruits.add("Banana");    
	      fruits.add("Grapes");    
	      //Printing the arraylits Fruits object   
	      System.out.println(fruits);
	      fruits.set(2, "Dates"); // Change and Set an Item fruit dates.
	      System.out.println(fruits.get(2));
	      fruits.get(0);   // Access an Item fruit black grapes.
	      System.out.println("Black Grapes");
	      fruits.remove(2); // remove an Item fruit.
		  fruits.remove(1);
		  System.out.println(fruits);
	      	
	}

}
