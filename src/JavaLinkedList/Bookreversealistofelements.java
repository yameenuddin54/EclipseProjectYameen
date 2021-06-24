package JavaLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Bookreversealistofelements {

public static void main(String args[]){  
	
	LinkedList<String> book=new LinkedList<String>();  
    book.add("Data Communications");  
    book.add("Data Networking");  
    book.add("Data Warehouse");
    book.add("Let us C");
    //Traversing the list of elements in reverse order  
    Iterator i=book.descendingIterator();  
    while(i.hasNext())  
    {  
        System.out.println(i.next());  
    }  

}

}
