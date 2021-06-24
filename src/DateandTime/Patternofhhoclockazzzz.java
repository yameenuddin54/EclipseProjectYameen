package DateandTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Patternofhhoclockazzzz {

	public static void main(String[] args) {
		// Formatting Time as per Pattern ("hh 'o''clock' a, zzzz").
		
		Date dNow = new Date();
	     SimpleDateFormat ft = 
	     new SimpleDateFormat ("hh 'o''clock' a, zzzz");

	      System.out.println("Current Time: " + ft.format(dNow));
		

	}

}
