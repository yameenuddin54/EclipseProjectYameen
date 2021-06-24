package Practice;

public class JavaCasting {

	public static void main(String[] args) {
		//This is my Third java coding practice class on JavaCasting
		
		/*int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0*/
	    
	    
	    double myDouble = 9.78;
	    int myInt = (int) myDouble; // Manual casting: double to int

	    System.out.println(myDouble);   // Outputs 9.78
	    System.out.println(myInt);      // Outputs 9
	  }
	}