package loops;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String option="";
		while(!option.equalsIgnoreCase("JAVA")) {
			System.out.println("crrt sub");
			option=s.nextLine();
		}
		System.out.println("hello");
	}

}
