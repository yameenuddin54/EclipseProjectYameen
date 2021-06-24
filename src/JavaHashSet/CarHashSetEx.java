package JavaHashSet;

import java.util.HashSet;

public class CarHashSetEx {

	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW"); // Item is Duplicate it appears only 1 time
	    cars.add("Mazda");
	    System.out.println(cars);

	}

}
