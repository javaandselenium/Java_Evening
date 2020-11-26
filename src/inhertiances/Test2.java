package inhertiances;

public class Test2 extends Test1{
	Test2(){
		System.out.println("bye");
	}

	public static void main(String[] args) {
		Test2 t=new Test2();
		t.add();
		System.out.println(t.a);
		
	}
}
