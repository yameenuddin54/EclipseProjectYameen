package DateandTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateandTime {

	public static void main(String[] args) {
		
		//Formatting Date and Time Before and After
		
		LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	    
	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);	
		
	}

}
