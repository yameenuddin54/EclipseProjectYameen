package JavaHashSet;

import java.util.HashSet;

public class CapitalCitiesExHashSetItemExits {

	public static void main(String[] args) {
		// HashSet Example an item exists in a HashSet, use the contains() method:
     
		HashSet<String> hset = new HashSet<String>();
		   // Add keys and values (Country)
			    hset.add("England");
			    hset.add("Germany");
			    hset.add("Norway");
			    hset.add("USA");
			    System.out.println(hset);
			    
			    // Creating an Item exists in a HashSet, use the contains() method:
			    hset.contains("USA");
			    System.out.println("USA");

	}

}
