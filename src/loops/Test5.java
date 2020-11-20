package loops;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		
		String option = s.nextLine();
		
		while(option.equalsIgnoreCase("JAVA")) {
			System.out.println("crrt sub");
			break;	
		}
		
		System.out.println("hello");
	}

}
