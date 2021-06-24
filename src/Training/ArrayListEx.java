package Training;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {

	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Maruti Suzuki");
	    System.out.println(cars);
	    cars.set(1, "Mercedes");
	    System.out.println(cars.get(1));
	    cars.remove(2);
	    cars.remove(1);
	    System.out.println(cars);
	}

}
