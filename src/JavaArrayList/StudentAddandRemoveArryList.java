package JavaArrayList;

import java.util.ArrayList;

public class StudentAddandRemoveArryList {

	public static void main(String[] args) {
		// Add and Remove elements
		
		ArrayList<String> student = new ArrayList<String>();
	    student.add("Ravi");
	    student.add("Vijay");
	    student.add("Ajay");
	    student.add("Gaurav");
	    student.add("Sonoo");
	    System.out.println(student);
	    student.remove(2);
	    student.remove(1);
	    System.out.println(student);

	}

}
