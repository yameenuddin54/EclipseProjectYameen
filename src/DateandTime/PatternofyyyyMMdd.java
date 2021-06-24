package DateandTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PatternofyyyyMMdd {

	public static void main(String[] args) {
		// Formatting Current Year,Month and Date as per Pattern ("yyyy-MM-dd")

		Date dNow = new Date();
	     SimpleDateFormat ft = 
	     new SimpleDateFormat ("yyyy-MM-dd");

	      System.out.println("Current Year,Month and Date: " + ft.format(dNow));
	
		
		
	}

}
