package Scanner;

import java.util.Scanner;

public class ScannerAccountEx {

	public static void main(String[] args) {
		
		System.out.println("--------Enter Your Account Details-------- ");
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter Bank Name:");
	    String bankName = myObj.nextLine();
	    System.out.println("Enter Acc_No:");
	    long account_no = myObj.nextLong();
	    System.out.println("Amount:");
	    double amount = myObj.nextDouble();
	    
	    
	    
	    System.out.println( " Account Number is: " + account_no );
        System.out.println( " Bank Name is: " + bankName );
        System.out.println( " Total Amount Deposited is: " + amount);
		

	}

}
