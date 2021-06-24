package DateandTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PatternofyyyyMMddTHHmmssZ {

	public static void main(String[] args) {
		// Formatting Current Year,Month,Date with Time as per Pattern("yyyy-MM-dd'T'HH:mm:ssZ").
		
		Date dNow = new Date();
	     SimpleDateFormat ft = 
	     new SimpleDateFormat ("yyyy-MM-dd'T'HH:mm:ssZ");

	      System.out.println("Current Year,Month,date with Time: " + ft.format(dNow));
		 

	}

}
