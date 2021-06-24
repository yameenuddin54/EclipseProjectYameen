package JavaArrayList;

import java.util.ArrayList;

public class BookAddandRemoveArrayList {
	
	public static void main(String[] args) {
		//Add and Remove Elements
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Let us C");
		list.add("Data Communications and Networking");
		list.add("Operating System");
		System.out.println(list);
		list.remove(2);
	    list.remove(1);
	    System.out.println(list);
}
}
