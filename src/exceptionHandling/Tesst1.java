package exceptionHandling;

import java.io.FileInputStream;

public class Tesst1 {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("./N");
		} catch (Exception e) {
			System.out.println("handled");
		}
		
		int arr[]= {10,20,30,40};
		try {
		System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Handled");
		}
		
		
		System.out.println("hello");

	}

}
