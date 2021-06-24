package Practice;


public class OopsEx {

	int x = 10;
	int y = 20;
	int z = 5;
	
	int x1 = 45;
	int y2 = 25;
	
	public static void main(String[] args) {
		
		OopsEx myObj = new OopsEx();
	    
		System.out.println(myObj.x); //Create an object called "myObj" and print the value of x,y:
		System.out.println(myObj.y);
		
		System.out.println(myObj.z); // Multiple Objects Example ("myObj".z)
		System.out.println(myObj.z);
		
		System.out.println(myObj.x1);
	    System.out.println(myObj.y2);
		System.out.println(myObj.x + myObj.y +myObj.z); // SubTotal of "myObj" of (x,y,z)
		System.out.println(myObj.x1 + myObj.y2);        // SubTotal of "myObj of (x1,y2)
			

	}

}
