package JavaHashMap;

import java.util.HashMap;
import java.util.Map;

public class CarHashMapEx {

	public static void main(String[] args) {
		// Car HashMap
		
		Map<String, String> objMap = new HashMap<String, String>();
	    objMap.put("Name", "Suzuki");
	    objMap.put("Power", "220");
	    objMap.put("Type", "2-wheeler");
	    objMap.put("Price", "85000");
	    System.out.println("Elements of the Map:");
	    System.out.println(objMap);

	}

}
