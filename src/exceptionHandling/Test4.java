package exceptionHandling;

public class Test4 {
	public void demo() {
		try {
		int i=1/0;
		}
		catch(Exception e) {
			System.out.println("handled");
		}
		finally {
			System.out.println("hello");
		}
	}

	public static void main(String[] args) {
	Test4 t=new Test4();
	t.demo();
		int arr[]= {10,20,30};
	try {
	System.out.println(arr[5]);
	}
	finally {
		System.out.println("bye");
	}
	

	}

}
