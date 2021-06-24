package Scanner;

import java.util.Scanner;

public class ScannerSoftwareTestingEx {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);  
        System.out.print ("Enter a String: ");  
        String mystr = in.nextLine();  
        System.out.println("The String you entered is: " + mystr);             
        in.close();             
	}

}
