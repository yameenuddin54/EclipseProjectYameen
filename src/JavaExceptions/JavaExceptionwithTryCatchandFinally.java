package JavaExceptions;

public class JavaExceptionwithTryCatchandFinally {

	public static void main(String[] args) {
		// Java Exception with Try Catch and Finally Example
		
		try{
		       int d = 0;
		       int n =20;
		       int fraction = n/d;
		    }
		  catch(ArithmeticException e){
		    System.out.println("In the catch block due to Exception = "+e);
		  }
		  finally{
			System.out.println("Inside the finally block");
		  }
		
	}

}
