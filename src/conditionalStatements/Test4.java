package conditionalStatements;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		//int num=1234;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numb");
		int num=s.nextInt();
		
		if(num<100 && num>=1) {
			System.out.println("its a two digit numb");
		}
		
		else if(num<1000 && num>=100) {
			System.out.println("its a three digit numb");
		}
		
		else if(num<10000 && num>=1000) {
			System.out.println("its a four digit numb");
		}
		
		else if(num<100000 && num>=10000) {
			System.out.println("its a five digit numb");
		}
		else {
			System.out.println("the number is between 1 to 10000");
		}

	}

}
