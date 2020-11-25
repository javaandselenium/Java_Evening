package inhertiances;

public class Child2 extends Parent{
	public void bicycle() {
	System.out.println("bicycle from child2");	
		
	}

	public static void main(String[] args) {
		Child2 c=new Child2();
		c.bicycle();
		c.car();

	}

}
