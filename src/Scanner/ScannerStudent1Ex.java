package Scanner;

import java.util.*;

public class ScannerStudent1Ex {

	public static void main(String[] args) {
		 
		
        System.out.println("--------Enter Student Details-------- ");
        Scanner input = new Scanner(System.in);
        
        String name;
        int myclass;
        float percentage;
          
        System.out.print("Enter your name: ");
        name = input.next();
        System.out.print("Enter your class: ");
        myclass = input.nextInt();
        System.out.print("Enter your percentage: ");
        percentage = input.nextFloat();        
        input.close();
        System.out.println("Name: " + name + ", Class: "+ myclass + ", Percentage: "+ percentage);
     }
}
          
