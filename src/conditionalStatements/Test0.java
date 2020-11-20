package conditionalStatements;

import java.util.Scanner;

public class Test0 {

	public static void main(String[] args) {
		//int amt=40;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amt=s.nextInt();
		
		if(amt<=100) {
			System.out.println("you cannot withdraw");
		}

	}

}
