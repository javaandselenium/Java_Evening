package inhertiances;

public class IntermediateCal extends BasicCal {
	public void mul(int a ,int b) {
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		IntermediateCal i=new IntermediateCal();
		i.add(2, 3);
		i.sub(5,2);
		i.mul(3,4);
		
	}

}
