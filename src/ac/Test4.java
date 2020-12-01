package ac;

public class Test4 {
	protected int a=100;
	
	protected void demo() {
		System.out.println("protected method");
	}
	
	protected Test4() {
		System.out.println("protected constructor");
	}

	public static void main(String[] args) {
		Test4 t=new Test4();
		System.out.println(t.a);
		t.demo();

	}

}
