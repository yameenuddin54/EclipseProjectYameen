package JavaWrapperClassExamples;

public class WrapperclassExamplePrimitivetoWrapper {

	public static void main(String[] args) {
		//Java program to convert primitive into objects  
		//Autoboxing example of int to Integer 
		// Wrapper class Example: Primitive to Wrapper
		
		//Converting int into Integer  
		int a=20;  
		Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		  
		System.out.println(a+" "+i+" "+j);  

	}

}
