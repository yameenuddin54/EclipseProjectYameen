package JavaHashSet;

import java.util.HashSet;

public class CapitalCitiesExHashSetExClearItem {

	public static void main(String[] args) {
		// To Clear an Item
		
		HashSet<String> hset = new HashSet<String>();
		   // Add keys and values (Country)
			    hset.add("England");
			    hset.add("Germany");
			    hset.add("Norway");
			    hset.add("USA");
			    System.out.println(hset);
	       
		//  To remove all items, use the clear() method:

			    hset.clear();
			    System.out.println(hset);

	}

}
