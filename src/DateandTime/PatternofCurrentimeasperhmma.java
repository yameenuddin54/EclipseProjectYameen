package DateandTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PatternofCurrentimeasperhmma {

	public static void main(String[] args) {
		// Formatting Time as per Pattern ("h:mm a").
		
		Date dNow = new Date();
	     SimpleDateFormat ft = 
	     new SimpleDateFormat ("h:mm a");

	      System.out.println("Current Time: " + ft.format(dNow));

		
	}

}
