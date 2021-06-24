package JavaLinkedList;

import java.util.LinkedList;

public class BookAddFirstandAddLast {
	
		
		public static void main(String args[]){
		
		    LinkedList<String> book = new LinkedList<String>();
		    System.out.println("Initial list of elements: "+book);
		    book.add("Data Communications");
		    book.add("Data Networking");
		    book.add("Data Warehouse");
		    book.add("Let us C");
		    System.out.println(book);
		    book.remove("Java");  // Removing element from the LinkedList
		    System.out.println("After invoking addFirst(E e) method: "+book);
		    book.add("Etl Testing"); // Adding new element to LinkedList
		    System.out.println("After invoking addLast(E e) method: "+book);
		     
            book.removeAll(book);  //Removing all the new elements from LinkedListlist
            System.out.println("After invoking removeAll() method: "+book);
                  //Removing all the elements available in the list       
            book.clear();  
            System.out.println("After invoking clear() method: "+book);
		}
	}
