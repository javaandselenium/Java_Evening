package constructor;

public class Search1 {
	Search1(String phone)
	{
	System.out.println("phone");	
	}
	
	Search1(String address,int pinnumb)
	{
		this("iphone");
		System.out.println("address and pinnumb");
	}
	
	Search1(int quantity,String product,double payment)
	{
		this("fgfdfh",6768);
		System.out.println("quantity product and payment");
	}
	
	Search1(double payment,int quantity,String product)
	{
		this(34,"laptop",78.98);
		System.out.println("payment quantity and product");
	}
	
	
	public static void main(String[] args) {
		//new Search1(76.97,1,"Pen");
		Search1 s = new Search1("phone",8);

	}

}
