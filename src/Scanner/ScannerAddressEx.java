package Scanner;

import java.util.Scanner;

public class ScannerAddressEx {
	
	public static void main(String[] args) {
    
    System.out.println("\n--------Enter your Name and Address Details--------\t ");
    
   try (Scanner in = new Scanner( System.in )) {
	String firstname = "Yameen";
	String lastname = "Uddin";
	String address1 = "120 Maple Ave";
	
	System.out.print( "Enter your firstname: " );
	String firstName = in.next( );
	System.out.print( "Enter your lastname: " );
	String lastName = in.next( );
	System.out.print( "Complete address with your Full Name: " );
	String address = in.nextLine( );

	System.out.println( " FirstName: " + firstname );
    System.out.println( " LastName: " + lastname );
    System.out.println( " Address: " + address1 );

}
	}
	
}


