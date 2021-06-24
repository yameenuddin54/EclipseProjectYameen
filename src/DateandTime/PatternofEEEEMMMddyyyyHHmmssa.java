package DateandTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PatternofEEEEMMMddyyyyHHmmssa {

	public static void main(String[] args) {
		// Formatting Day,Month Date,Year and Time as per Pattern ("EEEE, MMM dd, yyyy HH:mm:ss a").
		
		Date dNow = new Date();
	     SimpleDateFormat ft = 
	     new SimpleDateFormat ("EEEE, MMM dd, yyyy HH:mm:ss a");

	      System.out.println("Current Day, Month Date, Year with Time: " + ft.format(dNow));
		
		
	}

}
