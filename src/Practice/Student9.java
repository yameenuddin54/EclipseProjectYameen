package Practice;

public class Student9 {  
		int rollno;  
		String name,course;  
		float fee;  
		Student9(int rollno,String name,String course){  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
		}  
		Student9(int rollno,String name,String course,float fee){  
		this(rollno,name,course);//reusing constructor  
		this.fee=fee;  
		}  
		void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}    
		 
		public static void main(String args[]){  
		Student9 s1=new Student9(111,"ankit","java");  
		Student9 s2=new Student9(112,"sumit","java",6000f);  
		s1.display();  
		s2.display();  
		}}  
