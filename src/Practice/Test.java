package Practice;
// 
public class Test {
int num;
String data;
float flt;
Test(){
	this.num=100;
	this.data="Test";
	this.flt=125.33f;	
}

public static void main(String arg[]){
	Test obj = new Test();
	System.out.println(obj.num);
	System.out.println(obj.data);
	System.out.println(obj.flt);
}
}