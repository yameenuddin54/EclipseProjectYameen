package JavaIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BooksIteratorEx {

	public static void main(String[] args) {

		ArrayList<String> books = new ArrayList<String>();
	     books.add("C");
	     books.add("Java");
	     books.add("Cobol");
	     
	     Iterator<String> it = books.iterator();
		 
		    while(it.hasNext()) {
		      String obj = (String)it.next();
		      System.out.println(obj);
		    }
	}

}
