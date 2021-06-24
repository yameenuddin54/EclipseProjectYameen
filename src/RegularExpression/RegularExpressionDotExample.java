package RegularExpression;

import java.util.regex.Pattern;

public class RegularExpressionDotExample {

	public static void main(String[] args) {
		// Regular Expression . Example
		// The . (dot) represents a single character.
		
		System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
		System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
		System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
		System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
		System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  

	}

}
