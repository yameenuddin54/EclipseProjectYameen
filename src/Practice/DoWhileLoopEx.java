package Practice;

import java.util.Scanner;

public class DoWhileLoopEx {

	public static void main(String[] args) {
		// DoWhileLoop Example
		
		/*int sum = 0, i = 100;
		   
        /*while (i != 0) {
            sum += i;     // sum = sum + i;
            --i;
        }
	   
        System.out.println("Sum = " + sum);*/
        
        

        Double number, sum = 0.0;
        // creates an object of Scanner class
        Scanner input = new Scanner(System.in);

        do {

            // takes input from the user
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            sum += number;
        } while (number != 0.0);  // test expression
	   
        System.out.println("Sum = " + sum);
	}

}
