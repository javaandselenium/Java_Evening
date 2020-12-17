package exceptionHandling;

import java.io.FileInputStream;

public class Test0 {

	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("./D");
		}
		catch(Exception e) {
		System.out.println("Handled 1");	
		}
	   try {
	   int b=1/0;
	   }
	   catch(ArithmeticException b) {
	   System.out.println("handled ");
	   }
	   
	   System.out.println("hello java");
	   System.out.println("hello selenium");

	}

}
