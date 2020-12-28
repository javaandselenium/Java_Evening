package collections;

import java.util.ArrayList;

public class Test29 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(10);
		a.add(300);
		a.add(100);
		ArrayList a1=new ArrayList<>();
		a1.add(10000);
		a1.add(30000);
		a1.add(10000);
		
//		System.out.println(a.retainAll(a1));
//		System.out.println(a);
		System.out.println(a.removeAll(a1));
		System.out.println(a);
		

	}

}
