package ac;

public class Test2 {
	private int a=10;
	
	private void abc() {
		System.out.println("private method");
	}
	
	private Test2() {
		System.out.println("private constructor");
	}

	
 public static void main(String[] args) {
		Test2 t=new Test2();
		t.abc();
		System.out.println(t.a);

		  Test3 t1=new Test3();
		  System.out.println(t1.a);
		  t1.demo();
	}

}
