package Scanner;

import java.util.Scanner;
public class ScannerFloatEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your course name: ");
		String courseName = scanner.nextLine();

		System.out.println("Enter your course grade: ");
		float courseGrade = scanner.nextFloat();

		System.out.println("Enter your course weight: ");
		float courseWeight = scanner.nextFloat();

		scanner.close();
		
	}

}
