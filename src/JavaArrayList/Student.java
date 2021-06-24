package JavaArrayList;

import java.util.ArrayList;

public class Student {

	public static void main(String[] args) {
		
		ArrayList<String> student = new ArrayList<String>();
	    student.add("Ravi");
	    student.add("Vijay");
	    student.add("Ajay");
	    student.add("Gaurav");
	    student.add("Sonoo");
	    System.out.println(student);
	    student.set(1, "John");
	    System.out.println(student.get(1));
	    student.remove(2);
	    student.remove(1);
	    System.out.println(student);
		

	}

}
