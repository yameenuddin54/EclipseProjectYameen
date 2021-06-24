package JavaHashSet;

import java.util.HashSet;

public class GeeksHashSetEx {

	public static void main(String[] args) {
		// Instantiate an object
        // of HashSet
        HashSet<String> hs = new HashSet<String>();
  
        // Elements are added using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("B");
        hs.add("Z");
  
        // Print the contents on the console
        System.out.println("Initial HashSet " + hs);
  
        // Removing the element B
        hs.remove("B");
  
        // Print the contents on the console
        System.out.println("After removing element " + hs);
  
        // Returns false if the element is not present
        System.out.println("Element AC exists in the Set : "
                           + hs.remove("AC"));

	}

}
