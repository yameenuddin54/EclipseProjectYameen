package Practice;

public class ArraysEx2 {

	public static void main(String[] args) {
		// Arrays Examples 2
		
		/*int a[]=new int[5];//declaration and instantiation
		a[0]=10;//initialization
		a[1]=20;
		a[2]=70;
		a[3]=40;
		a[4]=50;

		//printing array
		for(int i=0;i<a.length;i++)//length is the property of array
		System.out.println(a[i]);*/
		
		/* int a[]={33,3,4,5};//declaration, instantiation and initialization

		//printing array
		for(int i=0;i<a.length;i++)//length is the property of array
		System.out.println(a[i]);*/
		
		int arr[]={33,3,4,5};  
		//printing array using for-each loop  
		for(int i:arr)  
		System.out.println(i);
		
		
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		 if(min>arr[i])
		  min=arr[i];

		System.out.println(min);
		}

		/*public static void main(String args[]){

		int a[]={33,3,4,5};
		min(a);//passing array to method*/

		

	}

