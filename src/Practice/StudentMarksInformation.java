package Practice;

public class StudentMarksInformation {

	public static void main(String[] args) {
		
		//This is my Second java coding practice class
		
				int studentId = 202;
				int hallTicketNo = 1000204;
				String fName = "John";
				String lName = "Doe";
				int science = 85;
				int maths = 90;
				int social = 70;
				int english = 45;
				int telgue = 60;
				int computers = 100;
				int totMarks = science + maths + social + english + telgue + computers;
				
				System.out.println("Student Subjects Marks Information");//This is display variable
				System.out.println("----------------------------------");
				System.out.println("StudentID     : " +studentId);
				System.out.println("Student Name  : " + lName +" "+fName);
				System.out.println("Science       : " +science);
				System.out.println("Maths         : " +maths);
				System.out.println("Social        : " +social);
				System.out.println("English       : " +english);
				System.out.println("Telgue        : " +telgue);
				System.out.println("Computers     : " +computers);
				System.out.println("=========================");
				System.out.println("Totol Marks   : " +totMarks);
				System.out.println("HallTicket No : " +hallTicketNo);
				
				
	}

}

