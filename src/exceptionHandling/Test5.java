package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test5 {
	public void sample() throws FileNotFoundException {
		FileInputStream f=new FileInputStream("./k");
		System.out.println("hello");
	}

	public static void main(String[] args) {
	Test5 t=new Test5();
	try {
	t.sample();
	}
	catch(Exception e) {
		System.out.println("handled");
	}
	System.out.println("bye");
	}

}
