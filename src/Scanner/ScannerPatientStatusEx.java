package Scanner;

import java.util.Scanner;

public class ScannerPatientStatusEx {

	public static void main(String[] args) {
		
		double weight, height; // patient status
		int age;
		System.out.println("--------Enter Patient Details-------- ");
		Scanner in = new Scanner( System.in );
		System.out.print( "Enter your weight : " );
		weight = in.nextDouble( );
		System.out.println( "Enter your height : ");
		height = in.nextDouble( );
		System.out.println( "Enter your age: " );
		age = in.nextInt();
		
        System.out.println( " Weight: " + weight );
        System.out.println( " Height: " + height );
        System.out.println( " Age: " + age );
	}

}
