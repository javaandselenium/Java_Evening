package collections;

import java.util.TreeSet;

public class Test23 {

	public static void main(String[] args) {
		TreeSet set1=new TreeSet();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		
		TreeSet set2=new TreeSet();
		set2.add(10);
		set2.add(20);
		set2.add(30);
		set2.add(40);
		set2.add(500);
		
		boolean s = set1.retainAll(set2);
		System.out.println(s);
		
	}

}
