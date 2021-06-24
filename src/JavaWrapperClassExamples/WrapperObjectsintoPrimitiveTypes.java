package JavaWrapperClassExamples;

public class WrapperObjectsintoPrimitiveTypes {

	public static void main(String[] args) {
		// Wrapper Objects into Primitive Types
		
		// creates objects of wrapper class
	    Integer aObj = Integer.valueOf(23);
	    Double bObj = Double.valueOf(5.55);

	    // converts into primitive types
	    int a = aObj.intValue();
	    double b = bObj.doubleValue();

	    System.out.println("The value of a: " + a);
	    System.out.println("The value of b: " + b);

	}

}
