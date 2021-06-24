package JavaWrapperClassExamples;

public class WrapperclassExampleWrappertoPrimitive {

	public static void main(String[] args) {
		// Wrapper class Example: Wrapper to Primitive
		//Java program to convert object into primitives  
		//Unboxing example of Integer to int 
		
		//Converting Integer to int    
		Integer a=new Integer(3);    
		int i=a.intValue();//converting Integer to int explicitly  
		int j=a;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(a+" "+i+" "+j);    

	}

}
