package Practice;

public class StringEx {

	public static void main(String[] args) {
		
		String employeename1 = "John";
		String employeename2 = "Dravid";
		
		System.out.println(employeename1.length());
		System.out.println(employeename2.length());
		System.out.println(employeename1.toUpperCase());
		System.out.println(employeename2.toLowerCase());
		System.out.println(employeename2.concat(" " +employeename1));
		System.out.println("Welcome to Java World,  \tThank you!");
		
		System.out.println(Math.max(100, 55));
		System.out.println(Math.min(260, 250));
		
		
		
		String txt = "Please locate where 'locate' occurs!"; // Finding a Character in String
		System.out.println(txt.indexOf("locate"));
		
		String greeting = "Hello";
	    System.out.println(greeting);
	    
	    String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    System.out.println("The length of the txt string is: " + txt1.length());
		
		
	    String txt11 = "Hi Welcome to java class";
	    System.out.println(txt11.toUpperCase());
	    System.out.println(txt11.toLowerCase());
	    
	    String firstName = "Sachin";
	    String lastName = "Tendulkar";
	    System.out.println(firstName + " " + lastName);
	    
	    String firstName1 = "Kiran ";
	    String lastName1 = "Johnson";
	    System.out.println(firstName1.concat(lastName1));
	    
	    String NamePlace = "We are located in \"Hyderabad\" from the north.";
	    System.out.println(NamePlace);
	    
	    String NamePlace1 = "The character \\ name is called backslash.";
	    System.out.println(NamePlace1);
	    
	    /*int x = 10;
	    int y = 20;
	    int z = x + y;
	    System.out.println(z);*/
	    
	    String x = "10";
	    String y = "20";
	    String z = x + y;
	    System.out.println(z);
	    
	    System.out.println(Math.max(5, 10)); // Example for Java Math for Math Max Value
	    
	    System.out.println(Math.min(5, 10)); // Example for Java Math for Min Max Value
	    
	    System.out.println(Math.sqrt(64)); // Example for Java Math for sqrt Value
	    
	    System.out.println(Math.abs(-4.7)); // Example for Java Math .abs(X) Value
	    
	    int randomNum = (int)(Math.random() * 101);  // Example Math Random Value 0 to 100
	    System.out.println(randomNum);
	    
	    

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
        
        int x1 = 10;
        int y1 = 9;
        System.out.println(x1>y1);
        
        int x11 = 50;
        int y11 = 10;
        if(x11>y11) {
        System.out.println("Hi And Hello Welcome To Java String Class");
        
        
        
        
        
        }
		
		

	}

}
