package blocks;

public class Test4 {
	{
		System.out.println("non static0");
	}
	
	static
	{
		System.out.println("static");
	}
	
	{
		System.out.println("non static1");
	}
	
	public void demo() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		Test4 t=new Test4();
		Test4 t1=new Test4();
	}

}
