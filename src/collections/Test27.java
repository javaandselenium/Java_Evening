package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test27 {
	

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		ListIterator t=a.listIterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		System.out.println("***********************");
		
		while(t.hasPrevious()) {
			System.out.println(t.previous());
		}
		

	}

}
