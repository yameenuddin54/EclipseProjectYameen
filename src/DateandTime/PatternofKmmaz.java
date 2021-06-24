package DateandTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PatternofKmmaz {

	public static void main(String[] args) {
		// Formatting Time as per Pattern ("K:mm a, z").
		
		Date dNow = new Date();
	     SimpleDateFormat ft = 
	     new SimpleDateFormat ("K:mm a, z");

	      System.out.println("Current Time: " + ft.format(dNow));
	      
	}

}
