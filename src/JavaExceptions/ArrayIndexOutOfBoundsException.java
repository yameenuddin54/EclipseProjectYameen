package JavaExceptions;
public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// Array Index Out Of Bounds Exception
		
			// write your code here
			    System.out.println("First line");
			    System.out.println("Second line");
			    System.out.println("Third line");

			    try {
			        int[] myIntArray = new int[]{1, 2, 3};
			        print4thItemInArray(myIntArray);
			    } catch (Exception e) {
			        System.out.println("The array doesn't have four items!");
			    }

			    System.out.println("Fourth line");
			    System.out.println("Fith line");
		    }

	private static void print4thItemInArray(int[] myIntArray) {
		
		
	}

		
	}



