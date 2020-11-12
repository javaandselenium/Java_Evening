package constructor;

public class Search {
	Search(String phone)
	{
	System.out.println("phone");	
	}
	
	Search(String address,int pinnumb)
	{
		System.out.println("address and pinnumb");
	}
	
	Search(int quantity,String product,double payment)
	{
		System.out.println("quantity product and payment");
	}
	
	Search(double payment,int quantity,String product)
	{
		System.out.println("payment quantity and product");
	}
	
	
	public static void main(String[] args) {
		Search s=new Search(7675.77686,4,"Phone");
		Search s1=new Search("botttle");
		new Search("fggfjh",67);
		

	}

}
