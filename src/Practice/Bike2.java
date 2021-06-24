package Practice;

public class Bike2 {
	
	int modelYear;
	  String modelName;
	  int numberPlate = 112450;
	  public Bike2(int year, String name) {
	    modelYear = year;
	    modelName = name;
	    
	  }
	  
	  static void xyzMethod() {  //Static method example
		System.out.println("Just for testing Static method"); 
		System.out.println("by Mohd");
	  }
	  
	  public void abcMethod() {
		  System.out.println("Mohammed is created bike without an object ");
	  }

	public static void main(String[] args) {
		Bike2 myBike = new Bike2(2021, "HeroHonda");
	    System.out.println(myBike.modelYear + " " + myBike.modelName);
	    
	    myBike.numberPlate=112450;
	    System.out.println(myBike.numberPlate);
	    xyzMethod();
	    myBike.abcMethod();

	}

}
