package Scanner;

import java.util.Scanner;

public class ScannerSubjectsEx {
	
    public static void main(String[] args) {
		
		System.out.println("The subjects are as fallows :");
		String input = "1 Maths 2 English 3 Science 4 Hindi";
		Scanner s = new Scanner(input);
		System.out.println(s.nextInt()+". ");
		System.out.println(s.next());
		System.out.println(s.nextInt()+". ");
		System.out.println(s.next());
		System.out.println(s.nextInt()+". ");
		System.out.println(s.next());
		System.out.println(s.nextInt()+". ");
		System.out.println(s.next());
		s.close();
		
   
		
		
		
		
		
		
		

	}

}
