package JavaHashSet;

import java.util.HashSet;

public class AlphabetsHashSetRemoveanItemEx {

	public static void main(String[] args) {
		
		// create a hash set
				HashSet<String> hs = new HashSet<String>();
			      
	   // add elements to the hash set
			    hs.add("B");
			    hs.add("A");
			    hs.add("D");
			    hs.add("E");
			    hs.add("C");
			    hs.add("F");
			    System.out.println(hs);
			    
	   // To Remove an Item from HashSet from Alphabets
			    hs.remove("D");
			    System.out.println(hs);
	}

}
