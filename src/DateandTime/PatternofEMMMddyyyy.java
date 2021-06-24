package DateandTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PatternofEMMMddyyyy {

	public static void main(String[] args) {
		// Formatting Current Day,Month,Date and Year as per Pattern ("E, MMM dd yyyy").
		
		Date dNow = new Date();
	     SimpleDateFormat ft = 
	     new SimpleDateFormat ("E, MMM dd yyyy");

	      System.out.println("Current Day,Month,Date and Year: " + ft.format(dNow));

	}

}
