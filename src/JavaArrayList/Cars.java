package JavaArrayList;

import java.util.ArrayList;

public class Cars {

	public static void main(String[] args) {
		// Create an ArrayList object called cars with method ( Add,Set and remove methods ).
		
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Tata Sumu");
	    cars.add("Toyota");
	    cars.add("Nissan");
	    cars.add("Jeep");
	    cars.add("Maruti Suzuki");
	    System.out.println(cars);
	    cars.set(4, "Dodge");
	    System.out.println(cars.get(4));
	    cars.remove(2);
	    cars.remove(1);
	    System.out.println(cars);  
	      
	   }
	}

