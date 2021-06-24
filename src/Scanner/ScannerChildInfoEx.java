package Scanner;

import java.util.Scanner;

public class ScannerChildInfoEx {

	public static void main(String[] args) {
		
		//declare data
        String name;    //Child's name
        int age;        //Child's age
        double height;  //Child's height
        
        System.out.println("--------Enter Your Child Details-------- ");
        //build Scanner
        Scanner input = new Scanner(System.in);
        
        // prompt for and read data
        System.out.println( "Name? Age? Height?" );
        name = input.next();
        age = input.nextInt();
        height = input.nextDouble();
        
        //print results
        System.out.println( "Name: " + name );
        System.out.println( "Age: " + age );
        System.out.println( "Height: " + height );
        
        
	}

}
