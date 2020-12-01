package ac;

public class Test3 {
	int a = 10;

	void demo() {
		System.out.println("Default method");
	}

	Test3() {
		System.out.println("Default constructor");
	}

	public static void main(String[] args) {
  Test3 t=new Test3();
  System.out.println(t.a);
  t.demo();
  
  Test4 t1=new Test4();
	System.out.println(t1.a);
	t1.demo();
	}

}
