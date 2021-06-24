package JavaLinkedList;

import java.util.LinkedList;

public class BookAddandRemoveLinkedList {
	
		
		public static void main(String args[]){
		
		    LinkedList<String> book = new LinkedList<String>();
		    System.out.println("Initial list of elements: "+book);
		    book.add("Data Communications");
		    book.add("Data Networking");
		    book.add("Data Warehouse");
		    book.add("Let us C");
		    System.out.println(book);
		    book.addFirst("Java");
		    System.out.println("After invoking addFirst(E e) method: "+book);
		    book.addLast("Etl Testing");
		    System.out.println("After invoking addLast(E e) method: "+book);
		}
	}
	

