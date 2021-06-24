package Training;

public class CommentsVariables {

	public static void main(String[] args) {
		
		//This is my first java coding
		
		int empId = 190;
		long contact = 9700045765L, altCont = 7899894654L;
		String fName = "Yameen";
		String lName = "Syed";
		float salary = 8500.55f;
		float ince = 580.00f;
		float tax = 128.35f;
		float totSal = salary + ince - tax;
		
		System.out.println("Payroll Information");//This is display variable
		System.out.println("-------------------");
		System.out.println("Employee ID  : " +empId);
		System.out.println("Employee Name: "+"Mr. " +lName +" "+fName);
		System.out.println("Salary       : " +salary);
		System.out.println("Incentive    : " +ince);
		System.out.println("Fedral Tax   : " +tax);
		System.out.println("=========================");
		System.out.println("Totol Salary : " +totSal);
		System.out.println("Contac No    : " +contact +" \nAlternate Contact :" +altCont);
		
		
	}

}
