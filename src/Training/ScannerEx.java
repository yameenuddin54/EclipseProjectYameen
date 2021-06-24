package Training;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {

	    Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter Employee Name");
	    String userName = myObj.nextLine();
	    System.out.println("Enter Employee Id");
	    int userId = myObj.nextInt();
	    System.out.println("Enter Salary: ");
	    double salary = myObj.nextDouble();
	    System.out.println("Enter Incentive : ");
	    double ince = myObj.nextDouble();
	    System.out.println("Enter Tax: ");
	    double tax = myObj.nextDouble();
	    double totSalary = salary + ince - tax;
	    System.out.println("Employee Name is: " + userName);
	    System.out.println("Employee Id is: " +userId);
	    System.out.println("Salary is: " +salary);
	    System.out.println("Incentive is : " +ince);
	    System.out.println("Federal Tax is : " +tax);
	    System.out.println("Total Salary is: " +totSalary);

	}

}
