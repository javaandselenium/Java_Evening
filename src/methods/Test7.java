package methods;

public class Test7 {
	public void add(int a)
	{
		System.out.println("Integer");
	}
	
	public void add(int a,double b)
	{
		System.out.println("Integer and double");
	}
	
	public void add(double a,int c,int b)
	{
		System.out.println("double and integer ad integer");
	}
	
	public void add(int a,int c, double b)
	{
		System.out.println("integer and integer and double");
	}

	public static void main(String[] args) {
		Test7 t=new Test7();
		t.add(10, 10, 456.8789);
		t.add(10);
	}
}
