package collections;

import java.util.Vector;

public class Test5 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Hello");
		v.add('A');
		v.add(10);
		v.add(20);
		v.add(30.00);
		v.add("Hello");
		v.add('A');
		v.add(10);
		v.add(20);
		v.add(30.00);
		v.add(30.00);
		v.add("Hello");
		v.add('A');
		v.add(10);
		v.add(20);
		v.add(30.00);
		v.add("Hello");
		v.add(10);
		v.add(20);
		v.add(30.00);
		v.add("Hello");
		System.out.println("The total elements stored in list "+v.size());
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		System.out.println("The current capapcity of the list "+v.capacity());
		

	}

}
