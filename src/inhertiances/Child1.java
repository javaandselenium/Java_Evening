package inhertiances;

public class Child1  extends Parent{
	public void bike() {
		System.out.println("Bike from child1");
	}

	public static void main(String[] args) {
		Child1 c=new Child1();
		c.bike();
		c.car();

	}

}
