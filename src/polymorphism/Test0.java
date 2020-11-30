package polymorphism;

public class Test0 {

	public static void main(String[] args) {
	//FoodApps f=new Swiggy();
		
		FoodApps f;
	f=new UberEats();
	f.eat();
	f=new FoodPanda();
	f.eat();

	}

}
