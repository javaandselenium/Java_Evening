package inhertiances;

public class AdvancedCal extends IntermediateCal {

	public void sinTeta() {
		System.out.println("sineTeta");
	}

	public void cosTeta() {
		System.out.println("cosTeta");
	}
	
	public static void main(String[] args) {
		AdvancedCal c=new AdvancedCal();
		c.add(2,4);
		c.sub(5,4);
		c.mul(3, 4);
		c.sinTeta();
		c.cosTeta();
	}

}
