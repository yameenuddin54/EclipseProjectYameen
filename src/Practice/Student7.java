package Practice;
// Example for a static method. 
public class Student7 {
	     int rollno;  
	     String name;  
	     static String college = "ITS";  
	     //static method to change the value of static variable  
	     static void change(){  
	     college = "BBDIT";  
	     }  
	     //constructor to initialize the variable  
	     Student7(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	     //method to display values  
	     void display(){System.out.println(rollno+" "+name+" "+college);}    
	 
	    public static void main(String args[]){  
	    Student7.change();//calling change method  
	    //creating objects  
	    Student7 s1 = new Student7(111,"Karan");  
	    Student7 s2 = new Student7(222,"Aryan");  
	    Student7 s3 = new Student7(333,"Sonoo");  
	    //calling display method  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
	}  
