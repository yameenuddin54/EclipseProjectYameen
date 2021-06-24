package Training;

public class Car {
		  int modelYear;
		  String modelName;
		  int id = 50;
		  public Car(int year, String name) {
		    modelYear = year;
		    modelName = name;
		    
		  }
		  
		  static void xyzMethod() {  //Static method example
			System.out.println("Just for testing Static method"); 
			System.out.println("by Yameen");
		  }
		  
		  public void abcMethod() {
			  System.out.println("You cannot call your method directly without creating an object");
		  }
		  public static void main(String[] args) {
		    Car myCar = new Car(1969, "Mustang");
		    System.out.println(myCar.modelYear + " " + myCar.modelName);
		    
		    myCar.id=5000;
		    System.out.println(myCar.id);
		    xyzMethod();
		    myCar.abcMethod();
		  }
		}



