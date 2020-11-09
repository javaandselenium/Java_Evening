package methods;

public class Test4 {
	
	int a=10;
	static int b=20;
	
	public void add()
	{
		System.out.println("adding");
	}
	
	public static void sub()
	{
		System.out.println("subtracting");
	}

	public static void main(String[] args) {
		System.out.println(Test4.b);
		Test4.sub();
		Test4 t=new Test4();
		System.out.println(t.a);
		t.add();
	}

}
