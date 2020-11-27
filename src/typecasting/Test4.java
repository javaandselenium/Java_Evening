package typecasting;

public class Test4 {
public void hotDrink() {
	System.out.println("hotdrink");
}
	
}

class Test5 extends Test4{
	public void coolDrinks() {
		System.out.println("cooldrinks");
	}
}

class Samle{
	public static void main(String[] args) {
		Test4 t=new Test5();
		t.hotDrink();
		
	}
}
