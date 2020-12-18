package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test6 {
	public void sample()  {
		try {
		FileInputStream f=new FileInputStream("./k");
		}
		catch(Exception e) {
			System.out.println("Handled");
		}
	}

	public static void main(String[] args) {
		Test6 t=new Test6();
		t.sample();

	}

}
