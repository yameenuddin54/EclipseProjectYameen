package JavaHashMap;

import java.util.HashMap;

public class capitalCitiesRemoveMethod {

	public static void main(String[] args) {
		// Remove an item
		// Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	    // Remove an Item with remove method

	    capitalCities.remove("England");
	    System.out.println(capitalCities);

	}

}
