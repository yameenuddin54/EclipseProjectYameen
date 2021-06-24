package Practice;

public class TestEncapsulation {

	public static void main(String[] args) 
	{
		Encapsulate obj = new Encapsulate();
		
		obj.setStdName("Mosin Ali");
		obj.setStdRollNo(4);
		obj.setStdId(12345);
		
		System.out.println("Student's Name    : " + obj.getStdName());
		System.out.println("Student's Roll no.: " + obj.getStdRollNo());
		System.out.println("Student's Id      : " + obj.getStdId());
				

	}

}
