package constructor;

public class Test0 {
	public void add()
	{
		System.out.println("adding");
	}
	
	Test0()
	{
		System.out.println("constructor");
	}
	

	public static void main(String[] args) {
		Test0 t=new Test0();
		t.add();
	}

}
