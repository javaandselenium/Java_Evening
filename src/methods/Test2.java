package methods;

public class Test2 {
	static String name="Ramesh";
	static String bankName="SBI";
	static int balance=1000;
	static int withdrawalamt=500;
	
	public static void withdrawal()
	{
		int bal = balance-withdrawalamt;
		System.out.println(bal);
	}
	
	

	public static void main(String[] args) {
		withdrawal();
	}

}
