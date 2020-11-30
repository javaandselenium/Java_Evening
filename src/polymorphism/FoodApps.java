package polymorphism;

public class FoodApps {

	public void eat() {
		System.out.println("eating apps");
	}
}

class Swiggy extends FoodApps{
	public void eat() {
		System.out.println("Briyani from Swiggy");
	}
}

class UberEats extends FoodApps{
	public void eat() {
		System.out.println("Pizza from ubereats");
	}
}

class FoodPanda extends FoodApps{
	public void eat() {
		System.out.println("Dosa from foodpanda");
	}
}

 class Test1{

	public static void main(String[] args) {
	//FoodApps f=new Swiggy();
		
		FoodApps f;
	f=new UberEats();
	f.eat();
	f=new FoodPanda();
	f.eat();

	}}
