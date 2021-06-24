package Training;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    try {
	      int[] myNumbers = {1, 2, 3, 4};
	      System.out.println(myNumbers[5]);
	    } catch (Exception e) {
	      System.out.println("Something went wrong. Please enter the value 0 to 3");
	      System.out.println("Please enter your mobile no as follows:ex: 9701709914");
	}
	    finally {
	        System.out.println("Thank you for your business");
	    }
	}
}
