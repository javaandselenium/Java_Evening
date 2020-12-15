package collections;

import java.util.ArrayList;

public class Test21 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add("Puri");
		a.add("Dosa");
		a.add("Chapathi");
		a.add("Idly");
		System.out.println(a);
		if(a.contains("Dosa")) {
			System.out.println("Dish is Avaialable");
		}
		else
		{
			System.out.println("Dish is not Avaialable");
		}
		

	}

}
