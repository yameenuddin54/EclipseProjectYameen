package Practice;

public class Encapsulate {
private String stdName; // Declare variables private in the Class.
private int stdRollNo;
private int stdId;

public String getStdName() // Applying public getter method for each private variables in the Class.
 {return stdName;}
public int getStdRollNo()
 {return stdRollNo;}
public int getStdId()
 {return stdId;}

//Applying public setter method for each private variables in the Class.
public void setStdName(String name) {stdName=name;}
public void setStdRollNo(int rollno) {stdRollNo=rollno;}
public void setStdId(int id) {stdId=id;}

}





