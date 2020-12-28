package methods;

public class Test15 {
	public void dispaly() {
		int a=10;
		System.out.println(a);
	}
	
	public int demo() {
		int b=20;
		System.out.println(b);
		return b;
	}
	
	public double test() {
		String name="Java";
		double numb=90.00;
		double no=89.00;
		System.out.println(numb);
		System.out.println(name);
		return no;
	}
	
	public double sample() {
		return 0;
		
		
	}

	public static void main(String[] args) {
		Test15 t=new Test15();
		//System.out.println(t.dispaly());
		System.out.println(t.demo());
		System.out.println(t.test());

	}

}
