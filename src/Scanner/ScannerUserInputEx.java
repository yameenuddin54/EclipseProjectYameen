package Scanner;

import java.util.*; 

public class ScannerUserInputEx {

	public static void main(String[] args) {
		System.out.println("\n--------Enter your UserInput Details-------- ");
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter first number- ");  
		int a= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int b= sc.nextInt();  
		System.out.print("Enter third number- ");  
		int c= sc.nextInt();  
		int d=a+b-c;  
		System.out.println("Total= " +d);	
		
		
	}

}
