package DateandTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingYearMonthandDate {

	public static void main(String[] args) {
		
		LocalDateTime myDtTt = LocalDateTime.now();
	    System.out.println(myDtTt);

	    System.out.println("Before formatting: " + myDtTt);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss a");

	    String formattedDate = myDtTt.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
		

	}

}
