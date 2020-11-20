package conditionalStatements;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the case");
		int marks = s.nextInt();

		switch (marks) {
		case 1:
			System.out.println("FC");
			break;
		case 2:
			System.out.println("SC");
			break;
		case 3:
			System.out.println("Third class");
			break;
		case 4:
			System.out.println("Fail");
			break;
		default:
			System.out.println("go home");

		}

	}

}
