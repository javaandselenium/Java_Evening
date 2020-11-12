package blocks;

public class Test2 {
	//static block
	static {
		System.out.println("static block");
	}
	
	//non static block
	{
		System.out.println("non static block");
	}
	
	//constructor
	Test2(int a)
	{
		System.out.println("eecuting constructor");
	}

	public static void main(String[] args) {
		System.out.println("executing main method");
		
		Test2 t=new Test2(10);
		

	}

}
