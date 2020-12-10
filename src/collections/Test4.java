package collections;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(10.00);
		a.add("Hello");
		a.add('A');
		a.add(10);
		
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(10.00);
		a1.add("Java");
		a1.add("Selenium");
		a1.add('B');
		a1.add(10);
		
		//a.removeAll(a1);
		//a1.removeAll(a);
		a.retainAll(a1);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}

	}

}
