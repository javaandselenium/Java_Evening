package collections;

import java.util.TreeSet;

public class Test13 {

	public static void main(String[] args) {
	TreeSet t=new TreeSet<>();
	t.add("Ramesh");
	t.add("Suresh");
	t.add("Mahesh");
	t.add("Suresh");
	t.add("Suresh");
	System.out.println(t);
	
	TreeSet t1=new TreeSet<>();
	t1.add(10);
	t1.add(200);
	t1.add(30);
	t1.add(500);
	t1.add(30);
	System.out.println(t1);
	
	}

}
