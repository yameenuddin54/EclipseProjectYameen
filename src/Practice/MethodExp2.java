package Practice;

public class MethodExp2 {
	
	static void checkAge(int age) {
	 if (age < 18) {
    System.out.println("Access is denied - You are not old enough!");
	 
	 } else {
	System.out.println("Access is granted - You are old enough!");
	 }
	 
	}
    public static void main(String[] args) {
    	checkAge(20);

	}

}
