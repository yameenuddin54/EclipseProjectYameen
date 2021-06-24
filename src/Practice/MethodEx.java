package Practice;

public class MethodEx {

	static void saminMethod() {
		System.out.println("This is my first training class on Methods with the ali sir!");
		int x = 11;
		int y = 6;
		int z = x-y;
		System.out.println("Total is: "+z);
	}
	
		static void saminMethod1(String fname) {   //fname is a Parameters
		    System.out.println(fname + " Syed");
		  }
		
		
		static void saminMethod2(String fname, int age) {
	        System.out.println(fname + " is " + age);
	      }
		
		static int saminMethod3(int x) {
	          return 5 + x;
	      }
		static int myMethod(int x, int y) {
		    return x + y;
		  }
		
		static int saminMethod4(int x, int y) {
		       return x + y;
		     }
		
		 public static void main(String[] args) {
			 
			 		
		saminMethod();
		
	
	   // myMethod 2 Example : for Parameters and Arguments
	
		  
		 
		    saminMethod1("Liam");      // Liam is the Arguments 
		    saminMethod1("Jenny");     // Jenny is the Arguments
		    saminMethod1("Anja");      // Anja is the Arguments
		    
		    
		    
		      
		        saminMethod2("Liam", 20);
		        saminMethod2("Jenny", 18);
		        saminMethod2("Anja", 35); 
	
	          
	          
	          System.out.println(saminMethod3(3)); 
	

		  
		 
		    System.out.println(myMethod(5, 3)); 
	
	
	       
	       
	       int z = saminMethod4(5, 3);
	       System.out.println(z);

		  }
		}



