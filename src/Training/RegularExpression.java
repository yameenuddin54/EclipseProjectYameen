package Training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {


	    Pattern pattern = Pattern.compile("yameens", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("Visit Yameen");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }

	}

}
