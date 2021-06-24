package Practice;
//Example of parameters constructor.
public class Student4 {
	    int id;  
	    String name;   
	    Student4(int i,String n){  
	    id = i;  
	    name = n;  
	    }    
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    Student4 s1 = new Student4(111,"Mohd Aslam");  
	    Student4 s2 = new Student4(222,"Salam Syed");  
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	   }  
	}  
