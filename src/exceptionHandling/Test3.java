package exceptionHandling;

public class Test3 {
	public void demo() {
		System.out.println("dermo");
	}

	public static void main(String[] args) {
		try {
	int a=1/0;
		}
		catch(Exception chethan)
		{
			System.out.println("Exception handled");
		}
	finally {
		Test3 t=new Test3();
		t.demo();
	}
		System.out.println("hello");

	}

}
