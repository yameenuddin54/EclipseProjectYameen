package JavaHashMap;

import java.util.HashMap;

public class capitalCitiesClearMethod {

	public static void main(String[] args) {
		
		// Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	 // To remove all items, use the clear() method
	    capitalCities.clear();
	    System.out.println(capitalCities); 

	}

}
