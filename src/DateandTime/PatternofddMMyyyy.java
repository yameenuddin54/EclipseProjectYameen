package DateandTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PatternofddMMyyyy {

	public static void main(String[] args) {
		// Formatting Current Date as per Pattern ("dd/MMM/YYYY").
		
		Date dNow = new Date();
	     SimpleDateFormat ft = 
	     new SimpleDateFormat ("dd/MM/YYYY");

	      System.out.println("Current Date: " + ft.format(dNow));
		

	}

}
