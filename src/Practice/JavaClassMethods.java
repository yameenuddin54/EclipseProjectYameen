package Practice;

public class JavaClassMethods {
		 
		  // Create a fullThrottle() method
		  public void fullThrottle() {
		    System.out.println("The car is going as fast as it can!");
		  }

		  // Create a speed() method and add a parameter
		  public void speed(int maxSpeed) {
		    System.out.println("Max speed is: " + maxSpeed);
		  }
		  
		  public void carColor(String color) {
			  System.out.println("Car color is: " +color);
		  }

		  // Inside main, call the methods on the myCar object


		 public static void main(String[] args) {
			    JavaClassMethods myCar = new JavaClassMethods	();     // Create a myCar object
			    myCar.fullThrottle();      // Call the fullThrottle() method
			    myCar.speed(200);          // Call the speed() method
			    myCar.carColor("Red");
			    myCar.carColor("with Black interior");
		
		
		
		
		
		
		

	}

}
