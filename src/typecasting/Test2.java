package typecasting;

public class Test2 {

	public void pen() {
		System.out.println("blue pen");
	}

}

class Test3 extends Test2{
	public void paper() {
		System.out.println("white paper");
	}
}

class Demo
{
	public static void main(String[] args) {
		Test2 t=new Test3();
		t.pen();
		
	}
}
