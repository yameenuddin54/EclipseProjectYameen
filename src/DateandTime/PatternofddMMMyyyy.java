package DateandTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PatternofddMMMyyyy {

	public static void main(String[] args) {
		// Formatting Current Date as per Pattern ("dd-MMM-YYYY")
		
		Date dNow = new Date();
	     SimpleDateFormat ft = 
	     new SimpleDateFormat ("dd-MMM-YYYY ");

	      System.out.println("Current Date: " + ft.format(dNow));
	
		
		

	}

}
