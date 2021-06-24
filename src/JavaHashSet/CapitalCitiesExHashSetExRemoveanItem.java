package JavaHashSet;

import java.util.HashSet;

public class CapitalCitiesExHashSetExRemoveanItem {

	public static void main(String[] args) {
		// To Remove an Item 
		
		HashSet<String> hset = new HashSet<String>();
		   // Add keys and values (Country)
			    hset.add("England");
			    hset.add("Germany");
			    hset.add("Norway");
			    hset.add("USA");
			    System.out.println(hset);
	       
			    //  To remove an item, use the remove() method:
			    hset.remove("Norway");
			    System.out.println(hset);
		
	}

}
