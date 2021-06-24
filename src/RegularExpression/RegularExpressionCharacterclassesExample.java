package RegularExpression;

import java.util.regex.Pattern;

public class RegularExpressionCharacterclassesExample {

	public static void main(String[] args) {
		// Regular Expression Character classes Example
		
		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once) 
		

	}

}
