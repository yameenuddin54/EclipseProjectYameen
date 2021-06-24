package JavaExceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrinterhandlecheckedexceptionExample {

	public static void main(String[] args) {
		// Printer handle checked exception Example
		
		PrintWriter pw;  
        try {  
            pw = new PrintWriter("jtp.txt"); //may throw exception   
            pw.println("saved");  
        }  
// providing the checked exception handler  
 catch (FileNotFoundException e) {  
              
            System.out.println(e);  
        }         
    System.out.println("File saved successfully");  

	}

}
