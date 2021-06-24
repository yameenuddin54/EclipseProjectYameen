package Practice;

    public class JavaClassAttributes {
    int a = 25;
    int b = 45;
    int c = 35;

    int x1;
    int x2 = 20;
    
    String fname = "Abrahim";             // Example for Multiple Attributes
	  String lname = "Lincoln";
	  int age = 36;
    public static void main(String[] args) {
    JavaClassAttributes myObj = new JavaClassAttributes();
    System.out.println(myObj.a +myObj.b+myObj.c);
	myObj.x1 =40;
	System.out.println(myObj.x1);         //Example for Modify Attributes
    
	myObj.x1 = 25; // x is now 25
	System.out.println(myObj.x1);        // Example for Override x value

	final int x2 = 10;

	myObj.x1 = 25; 
	System.out.println(myObj.x1);
	    
     
	  int x1 = 5;                      // Example for Multiple Objects
		  JavaClassAttributes myObj1 = new JavaClassAttributes();
		  JavaClassAttributes myObj2 = new JavaClassAttributes();
	    myObj2.x1 = 25;
	    System.out.println(myObj1.x1);
	    System.out.println(myObj2.x1);

	 
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Age: " + myObj.age);

	}

}
