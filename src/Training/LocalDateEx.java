package Training;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateEx {

	public static void main(String[] args) {
		LocalDate myDate = LocalDate.now(); // Create a date object
	    System.out.println(myDate); // Display the current date

	    LocalTime myTime = LocalTime.now();
	    System.out.println(myTime);


	    LocalDateTime myDtTt = LocalDateTime.now();
	    System.out.println(myDtTt);

	    
	    System.out.println("Before formatting: " + myDtTt);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss a");

	    String formattedDate = myDtTt.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	        
	    
	}
	
}
