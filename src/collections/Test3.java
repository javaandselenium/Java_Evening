package collections;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(10.00);
		a.add("Hello");
		a.add("");
		a.add('A');
		a.add(10);
		
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(10.00);
		a1.add("Hello");
		a1.add("");
		a1.add('A');
		a1.add(10);
	
		System.out.println(a.equals(a1));
//		System.out.println(a.remove(3));
//		System.out.println(a.contains(10));
//		System.out.println(a.containsAll(a1));
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}

}
