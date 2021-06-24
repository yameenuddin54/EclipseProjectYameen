package DateandTime;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormattingUsingSimpleDateFormat {

	public static void main(String[] args) {
		//Formatting Using Simple Date and Time Format
		
		 Date dNow = new Date();
	     SimpleDateFormat ft = 
	     new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

	      System.out.println("Current Date with Time: " + ft.format(dNow));
		

	}

}
