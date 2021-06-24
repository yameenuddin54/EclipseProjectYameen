package Practice;

public class SwitchStatement {

	public static void main(String[] args) {
		// Switch Statement Examples
		
		int day = 4;
		switch (day) {
		  case 6:
		    System.out.println("Today is Saturday");
		    break;
		  case 7:
		    System.out.println("Today is Sunday");
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend");
		}
		
		
        int day1 = 5;
		
		switch (day1) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		    default:
		    	System.out.println("Invalid case input");
		}

		
		int day11 = 4;
		switch (day11) {
		case 1:
		  System.out.println("Saturday");
		break;
		case 2:
		  System.out.println("Sunday");
		break;
		default:
		  System.out.println("Weekend");
		}
		
		
		
		
		
	}

}
