package interface1;

public class AbcImp implements Abccom{

	@Override
	public void cashBack() {
	System.out.println("cashback");
		
	}

	@Override
	public void freeDelivery() {
		System.out.println("Fd");
		
	}

	@Override
	public void couponCode() {
	System.out.println("cc");
		
	}

	@Override
	public void reSelleing() {
		System.out.println("rs");
		
	}

	@Override
	public void buyOneGetFree() {
		System.out.println("b1 get1");
		
	}
	public static void main(String[] args) {
		AbcImp a=new AbcImp();
		a.buyOneGetFree();
		a.cashBack();
		a.couponCode();
		a.freeDelivery();
		a.reSelleing();
	}

}
