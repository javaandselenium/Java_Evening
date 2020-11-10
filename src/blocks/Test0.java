package blocks;

public class Test0 {
	//static block
	static
	{
		System.out.println("Hello from static block");
	}

	//non static block
	{
		System.out.println("Non static block");
	}
	public static void main(String[] args) {
		System.out.println("Bye from main method");
		Test0 t=new Test0();

	}

}
